package com.ecommerce.EcommerceApi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_address")
public class Address {
    @Id
    private  Integer addressId;
    @Column(name = "")
    private  String addressName;
    @Column(name = "")
    private String landmark;
    @Column(name = "")
    private  String phoneNumber;
    @Column(name = "")
    private  String zipCode;
    @Column(name = "")
    private String state;
    @JoinColumn(name = "userId")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
