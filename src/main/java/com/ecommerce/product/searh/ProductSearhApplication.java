package com.ecommerce.product.searh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//@EntityScan("com.ecommerce.product.searh.model")
//@ComponentScan({"com.ecommerce.product.searh.repository", "com.ecommerce.product.searh.controller", "com.ecommerce.product.searh.service"})
//@SpringBootApplication(scanBasePackages = {"com.ecommerce.product.searh.controller", "com.ecommerce.product.searh.service"})
//@EnableAutoConfiguration
@SpringBootApplication
public class ProductSearhApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSearhApplication.class, args);
	}

}
