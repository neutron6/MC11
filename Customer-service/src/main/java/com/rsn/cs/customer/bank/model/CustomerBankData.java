package com.rsn.cs.customer.bank.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@EntityScan("com.rsn.cs.customer.*")
public class CustomerBankData {

	@Id
	@GeneratedValue(generator = "uuid-hibernate-generator")
	@GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "bank_id")
	private UUID bankId;

	@Column(name = "bank_balane")
	private String bankBalance;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "account_pin")
	private String accountPin;

	public UUID getBankId() {
		return bankId;
	}

	public void setBankId(UUID bankId) {
		this.bankId = bankId;
	}

	public String getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(String bankBalance) {
		this.bankBalance = bankBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountPin() {
		return accountPin;
	}

	public void setAccountPin(String accountPin) {
		this.accountPin = accountPin;
	}

	public CustomerBankData(UUID bankId, String bankBalance, String accountType, String accountPin) {
		super();
		this.bankId = bankId;
		this.bankBalance = bankBalance;
		this.accountType = accountType;
		this.accountPin = accountPin;
	}

	public CustomerBankData() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerBankData [bankId=" + bankId + ", bankBalance=" + bankBalance + ", accountType=" + accountType
				+ ", accountPin=" + accountPin + ", getBankId()=" + getBankId() + ", getBankBalance()="
				+ getBankBalance() + ", getAccountType()=" + getAccountType() + ", getAccountPin()=" + getAccountPin()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
