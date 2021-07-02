package com.infy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.infy.dto.AddressDTO;

@Entity
public class Address {
	@Id
	@Column(name="address_id")
	private int addressId;
//	@Column(name="address_city")
	private String city;
//	@Column(name="address_pincode")
	private String pincode;
	public Address(int addressId, String city, String pincode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	public static AddressDTO prepareaddressDTO(Address addressEntity) {
		return new AddressDTO(addressEntity.getAddressId(),addressEntity.getCity(),addressEntity.getPincode());
	}
	
}
