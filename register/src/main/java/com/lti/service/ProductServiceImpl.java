package com.lti.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Product;
import com.lti.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	
	
	@Autowired
	private ProductDao dao;
	
	
	@Transactional
	public List<Product> showAllProduct() throws IOException {	
		return dao.getAllProducts();
	}

	
}

