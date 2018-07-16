package com.cts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

@Repository
public class TransferRepository2 {
	
	public Account loadAccount(int accountNumber){
		System.out.println("Loaded account : "+ accountNumber);
		// Try to connect to DB and load the data
		
		  Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.cj.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cogdb","root","rootroot");;

		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "SELECT * FROM Account account where account.id=" + accountNumber;
		      
		      //STEP 4: Get the result 
		      ResultSet rs = stmt.executeQuery(sql);
		      
		      Account account = null;
		      while (rs.next()) {

					String username = rs.getString("name");
					Double balance = rs.getDouble("balance");
					
					account = new Account(accountNumber, username, balance);
					
					System.out.println("name : " + username);
					System.out.println("balance : " + balance);

				}
		      
		      return account;
		   }
		   catch(Exception e){
			   e.printStackTrace();
		   }
		return null;
		
	}

}
