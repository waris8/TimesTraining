package jdbc_project;

import java.sql.*;
public class MysqlCon3 {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
			Statement stmt = con.createStatement();
			int s=stmt.executeUpdate("Delete from emp where id=104");
			System.out.println(s+" Records deleted"); 
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	}
