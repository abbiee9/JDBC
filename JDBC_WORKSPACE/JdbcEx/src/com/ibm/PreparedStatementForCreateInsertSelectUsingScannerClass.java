package com.ibm;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementForCreateInsertSelectUsingScannerClass 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner c=new Scanner(System.in);
		System.out.println("Enter table name to create");
		String tname=c.next();
		System.out.println("Enter your first column name");
		String col1=c.next();
		System.out.println("Enter your second column name");
		String col2=c.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
		
		PreparedStatement ps=conn.prepareStatement("create table "+tname+"("+col1+" number(10),"+col2+" varchar2(20))");
		
		
		Boolean b=ps.execute();
		if(b==false)
		{
			System.out.println("table created successfully");
			System.out.println("enter the value for "+col1);
			int val1=c.nextInt();
			System.out.println("enter the vcalue for "+col2);
			String val2=c.next();
			PreparedStatement ps1=conn.prepareStatement("insert into "+tname+" "+ "values(?,?)");
			ps1.setInt(1, val1);
			ps1.setString(2, val2);
			int rows=ps1.executeUpdate();
			if(rows>=1)
			{
				System.out.println("Data inserted successfully");
				PreparedStatement ps2=conn.prepareStatement("select * from "+tname);
				ResultSet rs=ps2.executeQuery();
				while(rs.next())
				{
					System.out.println(col1+" "+col2);
					System.out.println(rs.getInt(1)+"    "+rs.getString(2));
				}
			}
			else
				System.out.println("please provide proper table info");
			
			
		}
		conn.close();

		
	}

}
