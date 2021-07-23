package jdbc_project;

import java.sql.*;
public class MysqlCon2 {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
			Statement stmt = con.createStatement();
			int s=stmt.executeUpdate("Update emp set age=24 where id=104");
			System.out.println(s+" Records updated"); 
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	}
