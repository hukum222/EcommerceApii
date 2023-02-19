package com.ecommerce.EcommerceApi.dao;

import com.ecommerce.EcommerceApi.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address,Integer> {
}
