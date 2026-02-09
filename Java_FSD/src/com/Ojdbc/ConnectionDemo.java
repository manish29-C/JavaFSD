package com.Ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver load Successfully");
		String url1="jdbc:oracle:thin:@localhost:1521/FREEPDB1";
		String user="manish";
		String pass="sa123";
		
		Connection con=DriverManager.getConnection(url1,user,pass);
		System.out.println("Connection establish successfully");
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("Select * from students");
		 while(rs.next()) {

	            System.out.println(
	                    rs.getInt(1) + " " +
	                    rs.getString(2) + " " +
	                    rs.getString(3) + " " +
	                    rs.getInt(4) + " " +
	                    rs.getInt(5)
	            );
	        }
	}

}
