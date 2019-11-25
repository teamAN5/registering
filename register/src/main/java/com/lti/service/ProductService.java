package com.lti.service;

import java.io.IOException;
import java.util.List;

import com.lti.entity.Product;

public interface ProductService {
	public List<Product> showAllProduct() throws IOException;
}
