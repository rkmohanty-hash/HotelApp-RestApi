package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Hotel;

@Repository
public interface HotelRepository extends CrudRepository<Hotel,Integer>{
	
	List<Hotel> findByAddressCity(String city);
	List<Hotel> findByAddressStreetName(String location);
	@Query("FROM Hotel h inner join h.menuList mn WHERE mn.menuName=?1")
	List<Hotel> getHotelsByMenu(String menuName);
	@Query("FROM Hotel h inner join h.delivery d WHERE d.partnerName=?1")
	List<Hotel> getHotelsByDelivery(String partnerName);
	
	@Query("FROM Hotel h INNER JOIN h.address a INNER JOIN h.menuList mn WHERE a.streetName=?1 AND mn.menuName=?2")
	List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);
	

}
