package com.ibm;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//loading driver class
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//create the connection
		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
	
		//create the prepared statement
		
		PreparedStatement ps=conn.prepareStatement("insert into ibm1 values(?,?)");
		ps.setInt(1,6002);
		ps.setString(2, "Shaikh");
		
		//execute query
		
		int b=ps.executeUpdate();
		
		//close the connection
		
		conn.close();
		System.out.println(b+ " row inserted");

	}

}
