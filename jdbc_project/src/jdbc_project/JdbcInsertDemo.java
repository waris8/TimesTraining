package jdbc_project;

import java.sql.*;
public class JdbcInsertDemo {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/javadb";
		try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection conn = DriverManager.getConnection(dbURL,"root", "");
			String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "bill");
			statement.setString(2, "secretpass");
		
statement.setString(3, "Bill Gates");
			statement.setString(4, "bill.gates@microsoft.com");
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");		}
		} catch (Exception ex) {
			ex.printStackTrace();			}		
	}	}
