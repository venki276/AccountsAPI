package com.anz.accounts.api.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anz.accounts.api.entity.TAccounts;
import com.anz.accounts.api.entity.TTransaction;
import com.anz.accounts.api.entity.projections.TTransactionProjection;

/**
 * 
 * @author venki
 * Contains one method, which returns the transaction details on an account.
 *
 */
public interface TTransactionRepository extends JpaRepository<TTransaction, Integer>{
	List<TTransactionProjection> findByTAccountsOrderByTransactionDateDesc(TAccounts account);
}
