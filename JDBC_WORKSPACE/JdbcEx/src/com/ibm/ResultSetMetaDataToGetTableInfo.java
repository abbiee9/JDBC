package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataToGetTableInfo
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
		
		Statement st=conn.createStatement();
		
		ResultSet rs=st.executeQuery("select * from ibm");
		
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(2));
		System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnTypeName(2));
		System.out.println(rsmd.getColumnTypeName(1));
		System.out.println(rsmd.isSearchable(2));
		System.out.println(rsmd.getColumnType(2));//returns sql data type for numeric=2, date=91
		System.out.println(rsmd.getColumnType(1));
		
		
	}

}
