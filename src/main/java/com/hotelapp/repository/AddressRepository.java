package com.hotelapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {

}
