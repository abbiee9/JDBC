package com.ibm;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseMetaDataEx 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
	
		DatabaseMetaData dbmd=conn.getMetaData();
		System.out.println(dbmd.getDatabaseMajorVersion());
		System.out.println(dbmd.getDatabaseMinorVersion());
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDriverMajorVersion());
		System.out.println(dbmd.getDriverMinorVersion());
		System.out.println(dbmd.getJDBCMajorVersion());
		System.out.println(dbmd.getJDBCMinorVersion());
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getUserName());
		System.out.println(dbmd.getURL());
		System.out.println(dbmd.getDatabaseProductVersion());
	
	
	}

}
