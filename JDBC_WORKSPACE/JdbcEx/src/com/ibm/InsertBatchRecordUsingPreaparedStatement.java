package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBatchRecordUsingPreaparedStatement 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
		PreparedStatement ps=conn.prepareStatement("insert into ibm values(?,?)");
		
		ps.setInt(1, 987);
		ps.setString(2, "dj");
		ps.addBatch();
		
		ps.setInt(1, 9244);
		ps.setString(2, "gopi");
		ps.addBatch();
		
		ps.setInt(1, 98237);
		ps.setString(2, "harsha");
		ps.addBatch();
		
		ps.setInt(1, 98227);
		ps.setString(2, "chakri");
		ps.addBatch();
		
		//ps.executeBatch();
		int a[]=ps.executeBatch();
		System.out.println(a.length);
		conn.close();
		System.out.println("dont copy paste ");
		
	}		
}
