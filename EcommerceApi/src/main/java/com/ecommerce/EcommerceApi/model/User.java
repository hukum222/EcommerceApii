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
@Table(name = "ecommerce_tbl")
public class User {

  @Id
  @Column(name = "user_id")
  private int userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
  private String password;
    @Column(name = "phoneNumber")
  private String phoneNumber;
}
