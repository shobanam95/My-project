package com.urwardrobe.service;
import java.util.List;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.urwardrobe.model.Product;

@Repository//It’s used to mark the Java file as something Spring calls a “Component”, which enables it to be scanned and incorporated into Spring’s code
@Transactional//Transaction management is all about data integrity… which means it’s all about keeping your data valid, non-corrupt and error free
//SESSION A Session is what we use to create open our initial transaction, perform some kind of database operation, and then commit the transaction 
// @Autowired annotation to automatically populate the sessionFactory with an actual real instantiated instance


public interface ProductService { //scalable

	public List<Product> getAllProducts();
	
	
}
