package com.ecommerce.EcommerceApi.dao;

import com.ecommerce.EcommerceApi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Integer> {
}