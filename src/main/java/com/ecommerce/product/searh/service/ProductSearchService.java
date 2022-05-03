package com.ecommerce.product.searh.service;

import com.ecommerce.product.searh.dto.ProductSearchDto;
import com.ecommerce.product.searh.model.Product;

import java.util.List;

public interface ProductSearchService {

    List<Product> createProduct(ProductSearchDto productSearchDto);
}
