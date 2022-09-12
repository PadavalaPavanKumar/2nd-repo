package JDBC;

import java.sql.*;

public class JdbcConnectivity {
	public static void main(String[] args) throws Exception {

		Class.forName("org.postgresql.Driver");
		// String url="jdbc:postgresql://localhost:5432/postgres";
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
		// System.out.println("conn");
		// Statement sts=con.createStatement();
		// String querry="select * from kspl.employees ";
		ResultSet sss = con.createStatement().executeQuery("select * from kspl.employees ");
		while (sss.next()) {

			String name = sss.getString("employee_name")+sss.getInt("employee_id")+"          "+sss.getString("project_name");
			System.out.println(name);
		}

		con.close();
	}
}
  