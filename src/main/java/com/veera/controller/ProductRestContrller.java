package com.veera.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.veera.data.ProductData;
import com.veera.service.ProductService;

@RestController
public class ProductRestContrller {
	
	private ProductService productService;
	
	public ProductRestContrller(ProductService productService)
	{
		this.productService = productService;
	}
	
	@PostMapping("/product")
	public ResponseEntity<ProductData> createProduct(@RequestBody ProductData productData)
	{
		return new ResponseEntity<ProductData>(productService.createProduct(productData), HttpStatus.OK);
	}

}