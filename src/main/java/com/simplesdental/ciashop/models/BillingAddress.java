package com.simplesdental.ciashop.models;

public class BillingAddress {

	private String city;
	private String country;
	private String district;
	private String reference;
	private String state;
	private String street;
	private String streetComplement;
	private String streetNumber;
	private String zipCode;
	private String ibgeCode;
	private boolean blockedAddressEditing;

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getDistrict() {
		return district;
	}

	public String getIbgeCode() {
		return ibgeCode;
	}

	public String getReference() {
		return reference;
	}

	public String getState() {
		return state;
	}

	public String getStreet() {
		return street;
	}

	public String getStreetComplement() {
		return streetComplement;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public boolean isBlockedAddressEditing() {
		return blockedAddressEditing;
	}

	public void setBlockedAddressEditing(boolean blockedAddressEditing) {
		this.blockedAddressEditing = blockedAddressEditing;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setIbgeCode(String ibgeCode) {
		this.ibgeCode = ibgeCode;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setStreetComplement(String streetComplement) {
		this.streetComplement = streetComplement;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
