package com.lti.repository;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.lti.entity.Product;

public class ProductDaoImpl implements ProductDao{
	@PersistenceContext
	private EntityManager entityManager;
	
	/*@Autowired
	private JdbcTemplate jTemp;*/

	/*@Override
	public int insertNewProduct(Product pro) throws OsException {
		String qry1 = "INSERT INTO Product(productId,productName,brand,productPrice,productDesc,category,productStatus,quantity) VALUES(?,?,?,?,?,?,?,?)";
		Object[] params = {pro.getProductId(),pro.getProductName(),pro.getBrand(),pro.getProductPrice(),pro.getProductDesc(),pro.getCategory(),pro.getProductStatus(),pro.getQuantity()};
		int returnVal = jTemp.update(qry1,params);
		return returnVal;
	}*/

	/*@Override
	public Product getProductById(int productId) {
		Product pro = manager.find(Product.class, productId);
		return pro;
	}*/

	@Transactional
	public List<Product> getAllProducts() throws IOException {
		Query qry1= entityManager.createQuery("select p from Product p");
		List<Product> productList = qry1.getResultList();
		return productList;
	}

	public int insertNewProduct(Product product) throws IOException {
	
		entityManager.persist(product);
	
		return 1;
	}
	
	
	/*class RowMapperFactory implements RowMapper<Product>{ //to retrieve all the records from the table	 
	@Override 
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException { 
		
		int productId = rs.getInt("productId"); 
		String productName =rs.getString("productName"); 
		String brand = rs.getString("brand");
		long productPrice = rs.getLong("productPrice");  
		String productDesc = rs.getString("productDesc"); 
		String category = rs.getString("category");
		String productStatus = rs.getString("productStatus");
		int quantity = rs.getInt("quantity");
		   
		Product prod = new Product();
		prod.setProductId(productId);
		prod.setProductName(productName);
		prod.setBrand(brand);
		prod.setProductPrice(productPrice);
		prod.setProductDesc(productDesc);
		prod.setCategory(category);
		prod.setProductStatus(productStatus);
		prod.setQuantity(quantity);
		return prod; 
	}
	}*/
}
		


