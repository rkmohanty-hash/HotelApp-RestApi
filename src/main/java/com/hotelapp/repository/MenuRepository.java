package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Menu;

@Repository
public interface MenuRepository extends CrudRepository<Menu,Integer>{
//All below query are same.	
	//Derived quries
	List<Menu> findByHotelHotelName(String hotelName);
	
	//@Query with jpql
	
	/*@Query("FROM Menu m INNER JOIN m.hotel h WHERE h.hotelName=?1")
	 *Menu entity name
	List<Menu> findByHotel(String hotelName);
	*/
	
	//@Query with SQL native query
	
	@Query(value="select * from menu m inner join hotel h on m.hotel_id=h.hotel_id where h.hotel_name=?1",nativeQuery=true)
	//hotel and menu table name
	List<Menu> findByHotel(String hotelName);
	

}
