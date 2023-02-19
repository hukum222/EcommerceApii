package com.ecommerce.EcommerceApi.controller;

import com.ecommerce.EcommerceApi.dao.IProductRepository;
import com.ecommerce.EcommerceApi.model.Product;
import com.ecommerce.EcommerceApi.service.ProductService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    IProductRepository repository;


    @Autowired
    ProductService productService;
    @PostMapping(value = "/product")
    public String saveProduct(@RequestBody String productRequest){
        JSONObject json=new JSONObject(productRequest);
        Product product=setProduct(json);
        productService.saveProduct(product);
        return "Product saved successfully";

    }

    private Product setProduct(JSONObject json) {
        Product product =new Product();
        product.setProductId(json.getInt("productId"));
        product.setProductName(json.getString("productName"));
        product.setPrice(json.getInt("price"));
        product.setBrand(json.getString("brand"));
        product.setCategory(json.getString("category"));
        product.setDescription(json.getString("description"));
        return product;

    }

}