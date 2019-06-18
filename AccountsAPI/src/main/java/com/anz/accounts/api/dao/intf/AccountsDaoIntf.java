package com.anz.accounts.api.dao.intf;

import java.util.List;

import com.anz.accounts.api.entity.projections.TAccountsProjection;
import com.anz.accounts.api.entity.projections.TTransactionProjection;
import com.anz.accounts.api.util.NoDataOrBadRequestException;

/**
 * 
 * @author venki
 * This is the DAO interface, which will be used in Service layer and 
 * implemented by AccountsDaoImpl.
 * 
 * Contains two methods:
 * 1. To retrieve the account list.
 * 2. To retrieve transaction history and throws NoDataOrBadrequestException, when there is 
 * no data found.
 *
 */
public interface AccountsDaoIntf {
	public List<TAccountsProjection> getAccountsList();
	public List<TTransactionProjection> getAccountTransactions(Long accountNumber) throws NoDataOrBadRequestException;
}
