package com.hotelapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHotelAppRestApiApplication
{ 
//implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHotelAppRestApiApplication.class, args);
	}
	
	

	/*@Override
	public void run(String... args) throws Exception {
		Address address=new Address("RK nagar", "Bangalore", 567890, "KAR");
		Menu menu1=new Menu("Pancake", 20);
		Menu menu2=new Menu("Burger", 20);
		Set<Menu>menuList=new HashSet<>(Arrays.asList(menu1,menu2));
		Delivery delvery1=deliveryService.getDeliveryByPartner("swiggy");
		
		Set<Delivery>deliveryList=new HashSet<>(Arrays.asList(delvery1));
		Hotel hotel=new Hotel("The Truffles", address, menuList, deliveryList);
		hotelService.addHotel(hotel);
		Hotel hotel=hotelService.getHotelById(202);
		System.out.println(hotel);
		hotel.getAddress().setCity("karwar");
		hotelService.updateHotel(hotel);
		hotel=hotelService.getHotelById(202);
		System.out.println(hotel);
		
	}
	*/
	

}
