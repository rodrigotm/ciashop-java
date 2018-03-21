package com.github.rodrigotm.ciashop.models;

import java.util.Date;
import java.util.List;

public class Customer {

	private boolean acceptsMarketing;
	private BillingAddress billingAddress;
	private List<TemplateRegister> allowedLogin;
	private List<ShippingAddress> shippingAddresses;
	private TemplateRegister templateRegister;
	private Date updatedAt;
	private boolean blocked;
	private SocialMedia socialMedia;
	private List<MetaField> metaFields;
	private Integer bonus;
	private Date createdAt;
	private String customerType;
	private Date dateOfBirth;
	private String documentId;
	private String documentType;
	private String email;
	private String gender;
	private Integer id;
	private boolean isAuthenticated;
	private boolean isComplete;
	private String maritalStatus;
	private String name;
	private String occupation;
	private String phoneAreaCode;
	private String phoneAreaCodeAlternative;
	private String phoneNumber;
	private String phoneNumberAlternative;
	private String regionalDocumentId;
	private String regionalDocumentState;
	private String regionalDocumentType;

	public List<TemplateRegister> getAllowedLogin() {
		return allowedLogin;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public Integer getBonus() {
		return bonus;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public String getCustomerType() {
		return customerType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
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

	public Integer getId() {
		return id;
	}

	public boolean getIsAcceptsMarketing() {
		return acceptsMarketing;
	}

	public boolean getIsAuthenticated() {
		return isAuthenticated;
	}

	public boolean getIsBlocked() {
		return blocked;
	}

	public boolean getIsComplete() {
		return isComplete;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public List<MetaField> getMetaFields() {
		return metaFields;
	}

	public String getName() {
		return name;
	}

	public String getOccupation() {
		return occupation;
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

	public String getRegionalDocumentId() {
		return regionalDocumentId;
	}

	public String getRegionalDocumentState() {
		return regionalDocumentState;
	}

	public String getRegionalDocumentType() {
		return regionalDocumentType;
	}

	public List<ShippingAddress> getShippingAddresses() {
		return shippingAddresses;
	}

	public SocialMedia getSocialMedia() {
		return socialMedia;
	}

	public TemplateRegister getTemplateRegister() {
		return templateRegister;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setAcceptsMarketing(boolean acceptsMarketing) {
		this.acceptsMarketing = acceptsMarketing;
	}

	public void setAllowedLogin(List<TemplateRegister> allowedLogin) {
		this.allowedLogin = allowedLogin;
	}

	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setMetaFields(List<MetaField> metaFields) {
		this.metaFields = metaFields;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
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

	public void setRegionalDocumentId(String regionalDocumentId) {
		this.regionalDocumentId = regionalDocumentId;
	}

	public void setRegionalDocumentState(String regionalDocumentState) {
		this.regionalDocumentState = regionalDocumentState;
	}

	public void setRegionalDocumentType(String regionalDocumentType) {
		this.regionalDocumentType = regionalDocumentType;
	}

	public void setShippingAddresses(List<ShippingAddress> shippingAddresses) {
		this.shippingAddresses = shippingAddresses;
	}

	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}

	public void setTemplateRegister(TemplateRegister templateRegister) {
		this.templateRegister = templateRegister;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
