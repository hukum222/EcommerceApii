package com.ecommerce.EcommerceApi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_product")
public class Product {
    @Id
    @Column(name = "product_id")
    private  Integer    productId;
    @Column(name = "product_name")
    private  String productName;
    @Column(name = "price")
    private  Integer price;
    @Column(name = "description")
    private  String description;
    @Column(name = "category")
    private  String category;
    @Column(name = "brand")
    private  String brand;

}