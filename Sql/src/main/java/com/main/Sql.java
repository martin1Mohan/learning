package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sql {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sonoo", "root", "Stgit123");
			Statement stmt = con.createStatement();

//			long re = stmt.executeUpdate("delete from emp1;");
//			System.out.println(re);

			ResultSet rs = stmt.executeQuery("select * from EmployeeData");

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
