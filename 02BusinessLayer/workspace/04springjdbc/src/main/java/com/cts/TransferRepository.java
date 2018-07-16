package com.cts;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransferRepository {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public Account loadAccount(int accountNumber){
		String SQL = "select * from Account a where a.id=?" ;
		
		AccountRowMapper rowMapper = new AccountRowMapper();
		Account account = jdbcTemplateObject.queryForObject(SQL, rowMapper, accountNumber);
		
		System.out.println(account);
		return account;
	}

}
