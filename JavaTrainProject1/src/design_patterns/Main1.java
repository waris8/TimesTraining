package design_patterns;

public class Main1 
{
	public static void main(String args[])
	{
		// TODO Auto-generated method stub
				String driver="com.mysql.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/javadb";
				String u="root";
				String p="";
				ORM o=new ORM(driver, url, u, p);
				Emp e1=new Emp(105, "Tom", 30);
				int r=o.save(e1);
				System.out.println(r+ " Records updated ");
	}
}
