package com.anz.accounts.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.accounts.api.dao.intf.AccountsDaoIntf;
import com.anz.accounts.api.entity.projections.TAccountsProjection;
import com.anz.accounts.api.entity.projections.TTransactionProjection;
import com.anz.accounts.api.services.intf.AccountsServiceIntf;
import com.anz.accounts.api.util.NoDataOrBadRequestException;

/**
 * 
 * @author venki
 * Implements AccountsServiceIntf and delegates request to DAO layer.
 *
 */
@Service
public class AccountsServiceImpl implements AccountsServiceIntf {
	
	@Autowired
	private AccountsDaoIntf accountsDao;
	
	public List<TAccountsProjection> getAccountsList() {
		return accountsDao.getAccountsList();
	}

	public List<TTransactionProjection> getAccountTransactions(Long accountNumber) throws NoDataOrBadRequestException {
		return accountsDao.getAccountTransactions(accountNumber);
	}
	

}
