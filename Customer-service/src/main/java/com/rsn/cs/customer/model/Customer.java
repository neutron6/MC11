package com.rsn.cs.customer.model;

import java.util.Arrays;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.rsn.cs.customer.bank.model.CustomerBankData;

@Entity
@Table(name = "customer")
@EntityScan("com.rsn.cs.customer.*")
public class Customer {

	@Id
	@GeneratedValue(generator = "uuid-hibernate-generator")
	@GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;

	@Column(name = "customer_first_name")
	private String customerFirstName;

	@Column(name = "customer_last_name")
	private String customerLastName;

	@Column(name = "customer_city_name")
	private String customerCity;

	@Column(name = "customer_resident_address")
	private String customerAddress;

	@Column(name = "customer_married_status")
	private String customerMarriedStatus;

	@Column(name = "customer_email_id")
	private String customerEmailId;

	@Column(name = "customer_email_password")
	private String customerPassword;

	@Column(name = "customer_gender")
	private String customerGender;

	@Column(name = "customer_pincode")
	private String pincode;

	@Column(name = "imagedata", length = 10000000)
	private byte[] imageData;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private CustomerBankData customerBankData;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerMarriedStatus() {
		return customerMarriedStatus;
	}

	public void setCustomerMarriedStatus(String customerMarriedStatus) {
		this.customerMarriedStatus = customerMarriedStatus;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	public CustomerBankData getCustomerBankData() {
		return customerBankData;
	}

	public void setCustomerBankData(CustomerBankData customerBankData) {
		this.customerBankData = customerBankData;
	}

	public Customer(UUID id, String customerFirstName, String customerLastName, String customerCity,
			String customerAddress, String customerMarriedStatus, String customerEmailId, String customerPassword,
			String customerGender, String pincode, byte[] imageData, CustomerBankData customerBankData) {
		super();
		this.id = id;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerCity = customerCity;
		this.customerAddress = customerAddress;
		this.customerMarriedStatus = customerMarriedStatus;
		this.customerEmailId = customerEmailId;
		this.customerPassword = customerPassword;
		this.customerGender = customerGender;
		this.pincode = pincode;
		this.imageData = imageData;
		this.customerBankData = customerBankData;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerCity=" + customerCity + ", customerAddress=" + customerAddress
				+ ", customerMarriedStatus=" + customerMarriedStatus + ", customerEmailId=" + customerEmailId
				+ ", customerPassword=" + customerPassword + ", customerGender=" + customerGender + ", pincode="
				+ pincode + ", imageData=" + Arrays.toString(imageData) + ", customerBankData=" + customerBankData
				+ ", getId()=" + getId() + ", getCustomerFirstName()=" + getCustomerFirstName()
				+ ", getCustomerLastName()=" + getCustomerLastName() + ", getCustomerCity()=" + getCustomerCity()
				+ ", getCustomerAddress()=" + getCustomerAddress() + ", getCustomerMarriedStatus()="
				+ getCustomerMarriedStatus() + ", getCustomerEmailId()=" + getCustomerEmailId()
				+ ", getCustomerPassword()=" + getCustomerPassword() + ", getCustomerGender()=" + getCustomerGender()
				+ ", getPincode()=" + getPincode() + ", getImageData()=" + Arrays.toString(getImageData())
				+ ", getCustomerBankData()=" + getCustomerBankData() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
