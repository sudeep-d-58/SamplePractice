package com.ecommerce.product.searh.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("price")
    @NonNull
    private BigDecimal price;

    @JsonProperty("size")
    private String size;

    @JsonProperty("type")
    private String type;

    @JsonProperty("color")
    private String color;

    @JsonProperty("createOn")
    @CreationTimestamp
    private LocalDate createOn;

    @JsonProperty("updatedOn")
    @UpdateTimestamp
    private LocalDate updatedOn;
}
