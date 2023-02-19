package com.ecommerce.EcommerceApi.service;

import com.ecommerce.EcommerceApi.dao.IUserRepository;
import com.ecommerce.EcommerceApi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepository repository;
    public User saveUser(User user){
        return repository.save(user);
    }


}
