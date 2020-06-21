package com.hotelapp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Delivery;
import com.hotelapp.repository.DeliveryRepository;

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService{
	
	@Autowired
	DeliveryRepository deliveryRepository;

	@Override
	public void updateDelivery(Delivery delivery) {
		deliveryRepository.save(delivery);
		
	}

	@Override
	public void deletedelivery(int deleveryId) {
		deliveryRepository.deleteById(deleveryId);
		
	}

	@Override
	@Transactional
	public Delivery getDeliveryById(int deliveryId) {
		return deliveryRepository.findById(deliveryId).get();
	}

	@Override
	@Transactional
	public Delivery getDeliveryByPartner(String partnerName) {
		return deliveryRepository.findByPartnerName(partnerName);
	}

}
