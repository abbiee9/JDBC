package com.ibm;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertBatchRecord 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
		Statement s=conn.createStatement();
		s.addBatch("insert into ibm values(1234,'dileep')");
		s.addBatch("insert into ibm values(124,'apuroop')");
		s.addBatch("insert into ibm values(12234,'vasi')");
		s.addBatch("insert into ibm values(122234,'sandeep')");
		int a[]=s.executeBatch();
		System.out.println(a.length);
		
		
		
	}
}
