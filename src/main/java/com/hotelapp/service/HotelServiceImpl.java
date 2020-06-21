package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.exception.HotelNotFoundException;
import com.hotelapp.exception.IdNotFoundException;
import com.hotelapp.model.Hotel;
import com.hotelapp.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
		
	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepository.save(hotel);
		
	}

	@Override
	public Hotel getHotelById(int hotelId) {
		return hotelRepository.findById(hotelId)
				.orElseThrow(()->new IdNotFoundException("Id not found"));
	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);
		
	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		List<Hotel> hotelList= hotelRepository.findByAddressCity(city);
		if(hotelList.isEmpty()) {
			throw new HotelNotFoundException("Hotel with city not found");
			
		}
		return hotelList;
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {
		List<Hotel> hotelMenu= hotelRepository.getHotelsByMenu(menuName);
		if(hotelMenu.isEmpty()) {
			throw new HotelNotFoundException("Hotel with this menu not found");
			
		}
		return hotelMenu;
	}

	@Override
	public List<Hotel> getHotelsByDelivery(String partnerName) {
		List<Hotel> hotelDelivery= hotelRepository.getHotelsByDelivery(partnerName);
		if(hotelDelivery.isEmpty()) {
			throw new HotelNotFoundException("Hotel with this delivery not found");
			
		}
		return hotelDelivery;
	}

	@Override
	public List<Hotel> getHotelsByLocation(String location) {
		List<Hotel> hotelLocation= hotelRepository.findByAddressStreetName(location);
		if(hotelLocation.isEmpty()) {
			throw new HotelNotFoundException("Hotel with this location not found");
			
		}
		return hotelLocation;
	}

	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
		List<Hotel> hotelLocationAndMenu= hotelRepository.getHotelsByLocationAndMenu(location, menuName);
		if(hotelLocationAndMenu.isEmpty()) {
			throw new HotelNotFoundException("Hotel with this location and menu not found");
			
		}
		return hotelLocationAndMenu;
	}

}
