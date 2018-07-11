package com.cts;

import org.springframework.stereotype.Component;

public class DatabaseConfig {
	
	public DatabaseConfig(){
		System.out.println("** Constructor injection if any will happen here");
	}
	
	String dbUrl;
	Long dbPort;
	public String getDbUrl() {
		return dbUrl;
	}
	public void setDbUrl(String dbUrl) {
		System.out.println("** Setter injection if any will happen here");
		this.dbUrl = dbUrl;
	}
	public Long getDbPort() {
		return dbPort;
	}
	public void setDbPort(Long dbPort) {
		this.dbPort = dbPort;
	}
	@Override
	public String toString() {
		return "DatabaseConfig [dbUrl=" + dbUrl + ", dbPort=" + dbPort + "]";
	}
	
	

}
