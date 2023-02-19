package com.ecommerce.EcommerceApi.service;

import com.ecommerce.EcommerceApi.dao.IProductRepository;
import com.ecommerce.EcommerceApi.model.Product;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepository repository;
    public Product saveProduct(Product product){
        return repository.save(product);
    }


    public JSONArray getProduct() {
        List<Product> productList=repository.findAll();

        JSONArray productArr=new JSONArray();
        for(Product product:productList){
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("productId", product.getProductId());
            jsonObject.put("productName",product.getProductName());
            jsonObject.put("price",product.getPrice());
            jsonObject.put("description",product.getDescription());
            jsonObject.put("category",product.getCategory());
            jsonObject.put("brand",product.getBrand());


        }
        return productArr;
    }

}