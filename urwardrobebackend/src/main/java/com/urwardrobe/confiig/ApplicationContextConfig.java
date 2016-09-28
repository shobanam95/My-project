package com.urwardrobe.confiig;
import java.util.Properties;

import javax.sql.DataSource;
import org.springframework.context.annotation.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(" ")//controller



public class ApplicationContextConfig {
	

@Bean(name = "viewResolver")
public InternalResourceViewResolver getViewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setPrefix("/WEB-INF/views/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
}



@Bean(name = "dataSource")
public DataSource getDataSource() {
    BasicDataSource dataSource = new BasicDataSource();
    dataSource.setDriverClassName("org.h2.Driver");
    dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
    dataSource.setUsername("sa");
    dataSource.setPassword("sa");
 
    return dataSource;
}

private Properties getHibernateProperties() {
    Properties properties = new Properties();
    properties.put("hibernate.show_sql", "true");
      properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
     properties.put("hibernate.hbm2ddl.auto", "create");
    return properties;
    }
    
@Autowired
@Bean(name = "sessionFactory")
public SessionFactory getSessionFactory(DataSource dataSource) {
localSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
 sessionBuilder.addAnnotatedClasses(User.class); 
 return sessionBuilder.buildSessionFactory();
}

@Autowired
@Bean(name = "transactionManager")
public HibernateTransactionManager getTransactionManager(
SessionFactory sessionFactory) {
HibernateTransactionManager transactionManager = new HibernateTransactionManager(
sessionFactory);

return transactionManager;
}
}

