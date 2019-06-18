package com.anz.accounts.api.entity.projections;

import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * @author venki
 * This Projection is to limit, format the data of TTransaction object
 *
 */
public interface TTransactionProjection {
	@Value("#{target.tAccounts.accountNumber}")
	String getAccountNumber();
	@Value("#{target.tAccounts.accountType.accountType + ' Account'}")
	String getAccountType();
	String getValueDate();
	String getCurrency();
	String getDebitAmount();
	String getCreditAmount();
	String getTransactionType();
	String getTransactionNarrative();
}
