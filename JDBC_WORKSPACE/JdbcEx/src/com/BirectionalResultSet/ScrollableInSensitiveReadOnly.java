package com.BirectionalResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScrollableInSensitiveReadOnly 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
		
		
		PreparedStatement ps=conn.prepareStatement("select * from ibm",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=ps.executeQuery();
		rs.next();// forward
		rs.next();
		System.out.println(rs.getRow());//2
		rs.previous();// backword
		System.out.println(rs.getRow());//1
		rs.previous();
		System.out.println(rs.getRow());//0
		System.out.println(rs.absolute(13));
		System.out.println(rs.getRow());
		
		conn.close();
		
	}

}
