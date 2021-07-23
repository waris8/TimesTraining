package jdbc_project;

import java.sql.*;
public class JdbcInsertDemo1 {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/javadb";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(dbURL, "root", "");
			String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "123456789");
			
statement.setString(2, "William Henry Bill Gates");
			statement.setString(3, "bill@gatesfoundation.org");
			statement.setString(4, "bill");
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!");		}
		} catch (Exception ex) {
			ex.printStackTrace();		}
	}	}
