package com.infy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.infy.entity.Address;



public interface AddressRepository extends JpaRepository<Address,Integer> {

}
