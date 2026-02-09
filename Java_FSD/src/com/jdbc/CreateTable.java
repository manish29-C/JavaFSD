package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "sa123");
		
	}

}
