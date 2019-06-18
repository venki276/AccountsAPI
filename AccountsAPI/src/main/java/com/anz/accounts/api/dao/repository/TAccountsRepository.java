package com.anz.accounts.api.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anz.accounts.api.entity.TAccounts;
import com.anz.accounts.api.entity.projections.TAccountsProjection;

/**
 * 
 * @author venki
 * Two methods:
 * 1. To find all accounts and sort by Account Number.
 * 2. Find the accounts object using Account Number.
 *
 */
public interface TAccountsRepository extends JpaRepository<TAccounts, Integer> {
	List<TAccountsProjection> findByOrderByAccountNumber();
	TAccounts findByAccountNumber(long accountNumber);
}
