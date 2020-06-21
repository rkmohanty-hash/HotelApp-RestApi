package com.hotelapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Delivery;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery,Integer>{
	
	//Derived Queries
	Delivery findByPartnerName(String partnerName);

}
