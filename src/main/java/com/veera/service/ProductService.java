package com.veera.service;

import org.springframework.stereotype.Service;

import com.veera.data.ProductData;
import com.veera.entity.ProductEntity;
import com.veera.mapper.ProductMapper;
import com.veera.repo.ProductRepo;

@Service
public class ProductService {
	
	private ProductRepo productRepo;
	
	private ProductMapper productMapper;
	
	public ProductService(ProductRepo productRepo, ProductMapper productMapper)
	{
		this.productRepo = productRepo;
		this.productMapper = productMapper;
	}

	public ProductData createProduct(ProductData productData) {
		System.out.println("..........");
		ProductEntity productEntity = productMapper.productDataToProductEntity(productData);
		ProductEntity productResponseEntity = productRepo.save(productEntity);
		ProductData productResponseData = productMapper.productEntityToProductData(productResponseEntity);
		return productResponseData;
	}

}
