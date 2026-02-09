package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class GetData {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url1="jdbc:mysql://localhost:3306/StudentDB";
		String user="root";
		String pass="sa123";
		String query="Select * from phone where Id=?";
		Connection con=DriverManager.getConnection(url1,user,pass);
		PreparedStatement ps=con.prepareStatement(query);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter id");
		int id=sc.nextInt();
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
	    if(rs.next()) {
            System.out.println("ID: " + rs.getInt(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Price: " + rs.getInt(3));
        } else {
            System.out.println("No record found!");
        }
		
		
	}

}
