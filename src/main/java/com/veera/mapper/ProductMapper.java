package com.veera.mapper;

import org.mapstruct.Mapper;

import com.veera.data.ProductData;
import com.veera.entity.ProductEntity;

@Mapper
public interface ProductMapper {
	ProductEntity productDataToProductEntity(final ProductData productData);
	ProductData productEntityToProductData(final ProductEntity productEntity);
}