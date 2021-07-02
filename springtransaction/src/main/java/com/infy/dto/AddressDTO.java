package com.infy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.infy.entity.Address;


public class AddressDTO {
   
	    private int addressId;
	    private String city;
	    private String pincode;
		public AddressDTO(int addressId, String city, String pincode) {
			super();
			this.addressId = addressId;
			this.city = city;
			this.pincode = pincode;
		}
		public AddressDTO() {}
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
			return "AddressDTO [addressId=" + addressId + ", city=" + city + ", pincode=" + pincode + "]";
		}
		 
//		public static Address prepareAddressEntity(Address address) {
//			Address addressEntity=new Address();
//			addressEntity.setAddressId(address.getAddressId());
//			addressEntity.setCity(address.getCity());
//			addressEntity.setPincode(address.getPincode());
//			return addressEntity;
//		}
		public static Address prepareAddressEntity(AddressDTO addressDTO) {
			return new Address(addressDTO.getAddressId(),addressDTO.getCity(),addressDTO.getPincode());
		}

}
