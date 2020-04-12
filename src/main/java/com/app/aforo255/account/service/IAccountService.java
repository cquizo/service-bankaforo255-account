package com.app.aforo255.account.service;

import java.util.List;

import com.app.aforo255.account.model.entity.Account;

public interface IAccountService {
	
	List<Account> findAll();
	Account findById(Integer id);
	Account save(Account account);

}
