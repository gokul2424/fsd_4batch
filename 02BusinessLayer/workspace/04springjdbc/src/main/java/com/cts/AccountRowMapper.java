package com.cts;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account>{

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt("id");
		String username = rs.getString("name");
		Double balance = rs.getDouble("balance");
		
		Account account = new Account(id, username, balance);
		return account;
	}

}
