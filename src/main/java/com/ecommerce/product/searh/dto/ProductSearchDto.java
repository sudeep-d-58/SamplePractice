package com.ecommerce.product.searh.dto;

import com.ecommerce.product.searh.model.Product;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class ProductSearchDto {
    @JsonProperty("products")
    private List<Product> products;

}
