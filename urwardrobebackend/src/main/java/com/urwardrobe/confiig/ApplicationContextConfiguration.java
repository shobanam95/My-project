package com.urwardrobe.confiig;

import java.util.Properties;




import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.apache.commons.dbcp.BasicDataSource; 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.urwardrobe.model.Product;
import com.urwardrobe.model.User;


@Configuration 
@EnableTransactionManagement

@ComponentScan({ "com.urwardrobe.confiig" })



public class ApplicationContextConfiguration {

	
	
	 
	   @Bean
	   public LocalSessionFactoryBean sessionFactory() {
	      LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	      sessionFactory.setDataSource(getDataSource());
	      sessionFactory.setHibernateProperties(hibernateProperties());
	      sessionFactory.setPackagesToScan(new String[] { "com.urwardrobe.model" });
	      sessionFactory.setAnnotatedClasses(User.class);
	      	      sessionFactory.setAnnotatedClasses(Product.class);
	     
	 	 	      return sessionFactory;
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
	   
	   @Autowired
	   @Bean(name = "transactionManager")
	   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	       HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	    
	       return transactionManager;
	   }
	 
	   @Bean
	   public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
	      return new PersistenceExceptionTranslationPostProcessor();
	   }
	 
	   private Properties hibernateProperties() {
			Properties properties = new Properties();
			properties.put("hibernate.show_sql", "true");
			properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");//This property makes Hibernate generate the appropriate SQL for the chosen database.
			properties.put("hibernate.hbm2ddl.auto","create");//hibernate.hbm2ddl.auto Automatically validates or exports schema DDL to the database when the SessionFactory 
															//is created. With create-drop, the database schema will be dropped when the SessionFactory is closed explicitly.
			//validate: validate the schema, makes no changes to the database.
			//update: update the schema.
			//create: creates the schema, destroying previous data.
			//create-drop: drop the schema at the end of the session.
			return properties;
		}
	} 




