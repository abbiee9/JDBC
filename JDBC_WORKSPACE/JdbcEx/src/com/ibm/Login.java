package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Login
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello ! Login here");
		System.out.println("Enter Username");
		String user=sc.next();
		System.out.println("Enter Password");	
		String pass=sc.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
		
		PreparedStatement ps=conn.prepareStatement("select * from registration where uname=? and pwd=?");
		ps.setString(1, user);
		ps.setString(2, pass);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			System.out.println("login success");
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		else
		{
			System.out.println("First Register");
			System.out.println("please enter your username");
			String user1=sc.next();
			System.out.println("please enter your password");	
			String pass1=sc.next();
			System.out.println("please enter your gender");
			String gend=sc.next();
			System.out.println("please enter your address");
			String address=sc.next();
			System.out.println("please enter your dob");
			String date=sc.next();
			
			SimpleDateFormat date3=new SimpleDateFormat("dd/mm/yy");
			java.util.Date date1=date3.parse(date);
			java.sql.Date date2=new java.sql.Date(date1.getTime());
			
			
			PreparedStatement ps1=conn.prepareStatement("insert into registration values(?,?,?,?,?)");
			ps1.setString(1, user1);
			ps1.setString(2, pass1);
			ps1.setString(3, gend);
			ps1.setString(4, address);
			ps1.setDate(5, date2);
			
			int a=ps1.executeUpdate();
			
			if(a>0)
			{
				System.out.println("registration successfull");
			}
			else
			{
				System.out.println("failure");
			}
			
			
		}
		

	}

}
