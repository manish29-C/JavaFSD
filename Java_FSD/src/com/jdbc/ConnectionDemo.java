package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {
	public static void main(String[] args) throws Exception{
		//loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load successfully");
		
		String url1="jdbc:mysql://localhost:3306/StudentDB";
		String user="root";
		String pass="sa123";
		
		//Establishing the connection
		//"orcale:jdbc:@localhost:1521:xe"
		Connection con=DriverManager.getConnection(url1,user,pass);
		System.out.println("Connection establish");
		
		//Create Statement
		 Statement st=con.createStatement();
		 
		 int i=st.executeUpdate("insert into phone values(201,'Vivo',45000),(202,'Oppo',78000),(203,'oneplus',78600)");
		  System.out.println(i+"row affected");
		 
//		 while(rs.next()==true) {
//			 System.out.println("Student id is "+rs.getInt(1));
//			 System.out.println("Student name is "+rs.getString(2));
//			 System.out.println("Gender is "+rs.getString(3));
//			 System.out.println("Department is "+rs.getString(4));
//			 System.out.println();
//			 System.out.println();
//		 }
		
	}

}
