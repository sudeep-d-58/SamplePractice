package com.ecommerce.product.searh.controller;

import com.ecommerce.product.searh.dto.ProductSearchDto;
import com.ecommerce.product.searh.model.Product;
import com.ecommerce.product.searh.service.ProductSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
@RequiredArgsConstructor
public class ProductSearchApiController {
    private final ProductSearchService productSearchService;

    @PostMapping(value = "/create", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Product>> createProduct(@RequestBody(required = true)ProductSearchDto productSearchDto) {
//        ProductSearchDto productSearchDto = new ProductSearchDto();
//        productSearchDto.setProducts(productList);
        return new ResponseEntity(productSearchService.createProduct(productSearchDto), HttpStatus.CREATED);
    }

    @GetMapping(value = "/check", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> checkApi() {
        return new ResponseEntity("Api is Up and Running", HttpStatus.OK);
    }
}
