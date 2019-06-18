package com.anz.accounts.api.entity;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="T_ACCOUNTS")
public class TAccounts {
	
	@Id
	@GeneratedValue
	private int id;
	private long accountNumber;
	private String accountName;
	@OneToOne
    @JoinColumn(name = "accountTypeId")
	private TAccountType accountType;
	private double accountBalance;
	private String currency;
	@Transient
	private String balanceDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public TAccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(TAccountType accountType) {
		this.accountType = accountType;
	}

	public String getAccountBalance() {
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		return formatter.format(accountBalance);
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBalanceDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(new Date());
	}

}
