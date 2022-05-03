package com.ecommerce.product.searh.repository;

import com.ecommerce.product.searh.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSearchRepository extends JpaRepository<Product,Long> {

}
