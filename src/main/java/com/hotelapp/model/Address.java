package com.hotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	@Id
	@GeneratedValue(generator="add_id",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="add_id",sequenceName="address_id")
	private Integer addressId;
	private String streetName;
	private String city;
	private long Zipcode;
	private String state;
	
	public Address() {
	}
		
	public Address(String streetName, String city, long zipcode, String state) {
		super();
		this.streetName = streetName;
		this.city = city;
		Zipcode = zipcode;
		this.state = state;
	}

	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipcode() {
		return Zipcode;
	}
	public void setZipcode(long zipcode) {
		Zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", Zipcode=" + Zipcode + ", state=" + state
				+ "]";
	}
	
	
	
	

}
