package com.ecommerce.product.searh.service.impl;

import com.ecommerce.product.searh.dto.ProductSearchDto;
import com.ecommerce.product.searh.model.Product;
import com.ecommerce.product.searh.repository.ProductSearchRepository;
import com.ecommerce.product.searh.service.ProductSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductSearchServiceImpl implements ProductSearchService {

    private final ProductSearchRepository productSearchRepository;

    @Override
    public List<Product> createProduct(ProductSearchDto productSearchDto) {
        return (List<Product>) productSearchRepository.saveAll(productSearchDto.getProducts());
    }
}
