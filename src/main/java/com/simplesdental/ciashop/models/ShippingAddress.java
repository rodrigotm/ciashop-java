package com.simplesdental.ciashop.models;

public class ShippingAddress {

	private String recipientName;
	private String local;
	private String street;
	private String streetNumber;
	private String streetcomplement;
	private String district;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	private String reference;
	private String phoneAreaCode;
	private String phoneNumber;
	private String phoneAreaCodeAlternative;
	private String phoneNumberAlternative;
	private Integer id;
	private Object selected;
	private Object main;
	private String streetComplement;
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

	public Integer getId() {
		return id;
	}

	public String getLocal() {
		return local;
	}

	public Object getMain() {
		return main;
	}

	public String getPhoneAreaCode() {
		return phoneAreaCode;
	}

	public String getPhoneAreaCodeAlternative() {
		return phoneAreaCodeAlternative;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPhoneNumberAlternative() {
		return phoneNumberAlternative;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public String getReference() {
		return reference;
	}

	public Object getSelected() {
		return selected;
	}

	public String getState() {
		return state;
	}

	public String getStreet() {
		return street;
	}

	public String getStreetcomplement() {
		return streetcomplement;
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

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public void setMain(Object main) {
		this.main = main;
	}

	public void setPhoneAreaCode(String phoneAreaCode) {
		this.phoneAreaCode = phoneAreaCode;
	}

	public void setPhoneAreaCodeAlternative(String phoneAreaCodeAlternative) {
		this.phoneAreaCodeAlternative = phoneAreaCodeAlternative;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPhoneNumberAlternative(String phoneNumberAlternative) {
		this.phoneNumberAlternative = phoneNumberAlternative;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setSelected(Object selected) {
		this.selected = selected;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setStreetcomplement(String streetcomplement) {
		this.streetcomplement = streetcomplement;
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
