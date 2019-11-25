package com.lti.repository;

import java.io.IOException;
import java.util.List;

import com.lti.entity.Product;

public interface ProductDao {
	
	public List<Product> getAllProducts() throws IOException ;
	public int insertNewProduct(Product product) throws IOException ;
	
	/*public Product getProductById(int productId);
	*/

}