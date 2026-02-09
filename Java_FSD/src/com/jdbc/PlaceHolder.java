package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PlaceHolder {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url1="jdbc:mysql://localhost:3306/StudentDB";
		String user="root";
		String pass="sa123";
		String query="Insert into phone values(?,?,?)";
		Connection con=DriverManager.getConnection(url1,user,pass);
		PreparedStatement ps=con.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter id");
		int id=sc.nextInt();
		
		System.out.println("Please enter brand name");
		String brand=sc.next();
		
		System.out.println("Please enter price");
		int price=sc.nextInt();
		ps.setInt(1, id);
		ps.setString(2, brand);
		ps.setInt(3, price);
		ps.executeUpdate();
		System.out.println("Data is inserted");
		System.out.println("Connection close");
		sc.close();
		
	}

}
