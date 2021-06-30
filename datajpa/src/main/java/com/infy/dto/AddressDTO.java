package com.infy.dto;

import com.infy.entity.Address;

public class AddressDTO {
	private int addressId;
	private String city;
	private String pincode;
	public AddressDTO() {
		super();
	}
	public AddressDTO(int addressId, String city, String pincode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.pincode = pincode;
	}
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
	public static Address prepareAddressEntity(AddressDTO addressDTO) {
		Address addressEntity=new Address();
		addressEntity.setAddressId(addressDTO.getAddressId());
		addressEntity.setCity(addressDTO.getCity());
		addressEntity.setPincode(addressDTO.getPincode());
		return addressEntity;
	}

}
