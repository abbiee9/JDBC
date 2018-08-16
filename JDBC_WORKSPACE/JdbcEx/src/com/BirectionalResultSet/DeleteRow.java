package com.BirectionalResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeleteRow
{

	public static void main(String[] args) throws Exception
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");

		PreparedStatement ps=conn.prepareStatement("select eid,ename from ibm",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=ps.executeQuery();
		
		rs.absolute(4);
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		rs.deleteRow();
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
	}

}
