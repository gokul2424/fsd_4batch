package com.cts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class AccountRepository {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	
	public Account loadAccount(int accountNumber){
		String SQL = "select a.id, a.name, a.balance from Account a where a.id=?" ;	
		AccountRowMapper rowMapper = new AccountRowMapper();
		Account account = jdbcTemplateObject.queryForObject(SQL, rowMapper, accountNumber);
		return account;
	}
	
	public List<Account> loadAllAccounts(){
		String SQL = "select * from Account a" ;	
		
		List<Map<String, Object>> accountsList = jdbcTemplateObject.queryForList(SQL);
		System.out.println(accountsList);
		List<Account> accounts = new ArrayList<>();
		for(Map<String, Object> accountRowMap : accountsList){
			Account account = new Account();
			account.setId((int)accountRowMap.get("id"));
//			account.setBalance((double)accountRowMap.get("balance"));
			account.setName((String)accountRowMap.get("name"));
			accounts.add(account);
		}
		System.out.println(accounts);
		return accounts;
	}

}
