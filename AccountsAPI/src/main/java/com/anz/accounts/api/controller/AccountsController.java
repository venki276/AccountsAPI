package com.anz.accounts.api.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anz.accounts.api.entity.projections.TAccountsProjection;
import com.anz.accounts.api.entity.projections.TTransactionProjection;
import com.anz.accounts.api.services.intf.AccountsServiceIntf;
import com.anz.accounts.api.util.NoDataOrBadRequestException;

/**
 * 
 * @author venki
 * This is the main controller class. It has three methods :
 * 1. Retrieves all the accounts
 * 2. Retrieves all the transactions on an account
 * 3. Throws a divide by zero exception (to show the working of generic exception handler)
 *
 */
@RestController
public class AccountsController {
	
	@Autowired
	private AccountsServiceIntf accountsService;
	
	/**
	 * 
	 * @returns the account list.
	 * Though there is no scope of exception, if any exception occurs, 
	 * the generic exception handler will be triggered.
	 */
	@RequestMapping(value="/getAccounts", method=RequestMethod.GET)
	public List<TAccountsProjection> getAccountsList(){
		return accountsService.getAccountsList();
	}
	
	/**
	 * 
	 * @param accountNumber
	 * @returns Transaction List
	 * @throws NoDataOrBadRequestException
	 */
	@RequestMapping(value="/getTransactions/{accountNumber}", method=RequestMethod.GET)
	public List<TTransactionProjection> getTransactionList(@PathVariable(value="accountNumber") String accountNumber) 
			throws NoDataOrBadRequestException {
		return accountsService.getAccountTransactions(Long.parseLong(accountNumber));
	}
	
	/**
	 * 
	 * @return
	 * Throws divide by zero exception. The response will be a JSON of ErrorDetails Object.
	 */
	@RequestMapping(value="/testExceptionHandling", method=RequestMethod.GET)
	public String getTransactionList() {
		int divideByZero = 1/0;
		return "Something";
	}

}
