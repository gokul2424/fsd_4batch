package com.cts;



import java.util.List;
import java.util.Map;

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
		String SQL = "select a.id, a.name, a.balance from Account a where a.id=?" ;
		
		AccountRowMapper rowMapper = new AccountRowMapper();
		Account account = jdbcTemplateObject.queryForObject(SQL, rowMapper, accountNumber);
		
//		Map<String, Object> resultMap=jdbcTemplateObject.queryForMap(SQL, accountNumber);
//		System.out.println(resultMap);

		
//		return null;
//		System.out.println(account);
		return account;
	}
	
//	public List<Account> loadAllAcc

}
