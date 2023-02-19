package com.ecommerce.EcommerceApi.dao;

import com.ecommerce.EcommerceApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
