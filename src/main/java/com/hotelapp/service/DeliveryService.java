package com.hotelapp.service;

import com.hotelapp.model.Delivery;

public interface DeliveryService {
	
	void updateDelivery(Delivery delivery);
	void deletedelivery(int deleveryId);
	Delivery getDeliveryById(int deliveryId);
	Delivery getDeliveryByPartner(String partnerName);
}
