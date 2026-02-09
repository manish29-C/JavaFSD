package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url1="jdbc:mysql://localhost:3306/StudentDB";
		String user="root";
		String pass="sa123";
		String query="Delete  from phone where Id=?";
		Connection con=DriverManager.getConnection(url1,user,pass);
		PreparedStatement ps=con.prepareStatement(query);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter id");
		int id=sc.nextInt();
		ps.setInt(1, id);
		int rows = ps.executeUpdate();
		if(rows>0) {
			System.out.println(rows + "Record deleted Successfully");
		}else {
			System.out.println("No record found");
		}
	}

}
