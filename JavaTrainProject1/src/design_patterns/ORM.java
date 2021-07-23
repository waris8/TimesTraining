package design_patterns;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//public class ORM {
//	
//	private Connection c;
//	private Statement ss;
//	
//	public ORM() {}
//
//	public ORM(Connection c, Statement ss) {
//		this.c = c;
//		this.ss = ss;
//	}
//	
//	public int save(Emp e) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			int s=ss.executeUpdate("Insert into emp values (" + e.getId() + ", " + e.getName() + ", " + e.getAge() + ")");
//			System.out.println(s+" Records inserted"); 
//			c.close();
//			return s;
//		}
//		catch (Exception ex) {
//			System.out.println(ex);
//			return 0;
//		}
//		
//	} 
//	
//}
class ORM {
	Statement ss;
	Connection c;

	ORM(String driver, String connectUrl, String id, String password) {
		try {
			Class.forName(driver);
			c = DriverManager.getConnection(connectUrl, id, password);
			ss = c.createStatement();
		} catch (Exception e) {
		}
	}

	int save(Emp e) {
		try {
			String s = "insert into emp values (" + e.getId() + ",'" + e.getName() + "'," + e.getAge() + ")";
			int x = ss.executeUpdate(s);
			return x;
		} catch (Exception ee) {
			return 0;
		}
	}

	int update(Emp e, int age) {
		try {
			String s = "update emp set age=" + age + "where id=" + e.getId() + ")";
			int x = ss.executeUpdate(s);
			return x;

		} catch (Exception ee) {
			return 0;
		}
	}

	int delete(Emp e) {
		try {
			String s = "delete from emp where id=" + e.getId() + ")";
			int x = ss.executeUpdate(s);
			return x;

		} catch (Exception ee) {
			return 0;
		}
	}

	List<Emp> getAll() {

		List<Emp> l = new ArrayList<>();

		try {
			ResultSet rs = ss.executeQuery("select * from emp");
			while (rs.next()) {
				Emp E = new Emp();
				E.setId(rs.getInt(1));
				E.setName(rs.getString(2));
				E.setAge(rs.getInt(3));
				l.add(E);
			}
			return l;

		} catch (Exception ee) {
			System.out.println(ee);
			return l;
		}

	}
}
