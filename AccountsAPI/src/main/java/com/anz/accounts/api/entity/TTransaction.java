package com.anz.accounts.api.entity;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="T_TRANSACTION")
public class TTransaction {
	
	@Id
	@GeneratedValue
	private int id;
	private Date transactionDate;
	private double transactionAmount;
	private String transactionType;
	private String comments;
	@OneToOne
    @JoinColumn(name = "accountId")
	private TAccounts tAccounts;
	private String currency;
	@Transient
	private String valueDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionNarrative() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public TAccounts getTAccounts() {
		return tAccounts;
	}
	public void setTAccounts(TAccounts tAccounts) {
		this.tAccounts = tAccounts;
	}
	public String getValueDate(){
		SimpleDateFormat dateFmt = new SimpleDateFormat("MMM. dd, YYYY");
		return dateFmt.format(getTransactionDate());
	}
	public String getDebitAmount(){
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		return ("Debit".equalsIgnoreCase(this.transactionType)) ? formatter.format(this.transactionAmount) : null;
	}
	public String getCreditAmount(){
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		return ("Credit".equalsIgnoreCase(this.transactionType)) ? formatter.format(this.transactionAmount) : null;		
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
