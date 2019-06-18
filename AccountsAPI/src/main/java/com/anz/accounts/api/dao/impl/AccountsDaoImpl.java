package com.anz.accounts.api.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anz.accounts.api.dao.intf.AccountsDaoIntf;
import com.anz.accounts.api.dao.repository.TAccountsRepository;
import com.anz.accounts.api.dao.repository.TTransactionRepository;
import com.anz.accounts.api.entity.TAccounts;
import com.anz.accounts.api.entity.projections.TAccountsProjection;
import com.anz.accounts.api.entity.projections.TTransactionProjection;
import com.anz.accounts.api.util.NoDataOrBadRequestException;

/**
 * 
 * @author venki
 * Access the data from HSQLDB.
 * Contains two methods:
 * 
 * 1. Retrieves accounts list
 * 2. Retrieves transaction history.
 *
 */
@Repository
public class AccountsDaoImpl implements AccountsDaoIntf {
	
	@Autowired
	private TAccountsRepository accountsRepository;
	
	@Autowired
	private TTransactionRepository transactionsRepository;

	public List<TAccountsProjection> getAccountsList() {
		return accountsRepository.findByOrderByAccountNumber();
	}

	public List<TTransactionProjection> getAccountTransactions(Long accountNumber) throws NoDataOrBadRequestException {
		TAccounts accountDetails = accountsRepository.findByAccountNumber(accountNumber);
		if(accountDetails==null){
			throw new NoDataOrBadRequestException("No data exists for the Account Number: "+accountNumber);
		}
		return transactionsRepository.findByTAccountsOrderByTransactionDateDesc(accountDetails);
	}

}
