package com.github.rodrigotm.ciashop.models;

import java.util.Date;

public class Billing {

	private String name;
	private String email;
	private String customerType;
	private String documentType;
	private String documentId;
	private String regionalDocumentId;
	private String regionalDocumentState;
	private String regionalDocumentType;
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
	private String gender;
	private Date dateOfBirth;

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getCustomerType() {
		return customerType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getDistrict() {
		return district;
	}

	public String getDocumentId() {
		return documentId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
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

	public String getReference() {
		return reference;
	}

	public String getRegionalDocumentId() {
		return regionalDocumentId;
	}

	public String getRegionalDocumentState() {
		return regionalDocumentState;
	}

	public String getRegionalDocumentType() {
		return regionalDocumentType;
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

	public String getStreetNumber() {
		return streetNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setRegionalDocumentId(String regionalDocumentId) {
		this.regionalDocumentId = regionalDocumentId;
	}

	public void setRegionalDocumentState(String regionalDocumentState) {
		this.regionalDocumentState = regionalDocumentState;
	}

	public void setRegionalDocumentType(String regionalDocumentType) {
		this.regionalDocumentType = regionalDocumentType;
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

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
