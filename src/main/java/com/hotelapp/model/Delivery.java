package com.hotelapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Delivery {

	@Id
	@GeneratedValue(generator="del_id",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="del_id",sequenceName="delivey_id")
	private Integer deliveId;
	private String partnerName;
	private double charges;
	@ManyToMany(mappedBy="delivery")
	@JsonIgnore
	private Set<Hotel> hotelList =new HashSet<>();

	public Delivery() {

	}

	public Delivery(String partnerName, double charges) {
		super();
		this.partnerName = partnerName;
		this.charges = charges;
	}

	public Integer getDeliveId() {
		return deliveId;
	}

	

	public void setDeliveId(Integer deliveId) {
		this.deliveId = deliveId;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public Set<Hotel> getHotelList() {
		return hotelList;
	}

	public void setHotelList(Set<Hotel> hotelList) {
		this.hotelList = hotelList;
	}
	@Override
	public String toString() {
		return "Delivery [partnerName=" + partnerName + ", charges=" + charges + "]";
	}

}
