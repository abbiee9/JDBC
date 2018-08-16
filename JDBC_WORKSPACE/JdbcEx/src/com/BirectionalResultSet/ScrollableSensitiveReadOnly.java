package com.BirectionalResultSet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScrollableSensitiveReadOnly 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
		
		
		PreparedStatement ps=conn.prepareStatement("select eid,ename from ibm",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//Statement ps=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println("press any key to get the nextt result");
			System.in.read();
			System.in.read();
			rs.refreshRow();
			int a=rs.getInt(1);
			String b=rs.getString(2);
			System.out.println(a);
			System.out.println(b);
			//rs.previous();
			System.in.read();
			System.in.read();
			rs.refreshRow();
			if(!(a==rs.getInt(1)&& b.equals(rs.getString(2))))
					
					{
						System.out.println("you have new update");
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));
					}
			
		}
		
	}
}
