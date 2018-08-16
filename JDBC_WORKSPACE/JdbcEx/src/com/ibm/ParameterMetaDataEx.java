package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ParameterMetaDataEx 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
		PreparedStatement ps=conn.prepareStatement("insert into ibm values(?,?)");
		
		
		
	ParameterMetaData pmd=ps.getParameterMetaData();
	System.out.println(pmd.getParameterCount());
	//System.out.println(pmd.getParameterType(1));
		
	}

}
