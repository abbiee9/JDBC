package com.ibm;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementForSelect 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		int eid=6002;
		//loading driver class
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//create the connection
		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
	
		//create the prepared statement
		
		PreparedStatement ps=conn.prepareStatement("select * from ibm where eid=?");
		ps.setInt(1,eid);
		
		//execute query	
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		
		//close the connection
		
		conn.close();

		
	}

}
