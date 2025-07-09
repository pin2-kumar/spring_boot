package com.firstapp.addressRepository;

import com.firstapp.controller.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AddressRepository extends JpaRepository<Address,Long> {

}
