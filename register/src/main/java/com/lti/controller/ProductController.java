package com.lti.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Product;
import com.lti.service.ProductService;

@Controller
public class ProductController {

		
	@Autowired
	private ProductService service;

//	@Autowired
//	private Product product;


	@RequestMapping("productList.lti")			
	public ModelAndView getproductList() throws IOException  {
		List<Product> prodList = service.showAllProduct();
		
		String jspName = "productList";
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("productList", prodList);
		mAndV.setViewName(jspName);
		return mAndV;
	}

}
