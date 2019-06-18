package com.anz.accounts.api.entity.projections;

import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * @author venki
 * This Projection is to simplify, format the object TAccounts
 *
 */
public interface TAccountsProjection {
	long getAccountNumber();
	String getAccountName();
	@Value("#{target.accountType.accountType}")
	String getAccountType();
	String getBalanceDate();
	String getCurrency();
	String getAccountBalance();
}
