package JDBC;

import java.sql.*;

public class JdbcDeleteValues {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
				"root");
		String querry = "delete from kspl.employees where (employee_id=1111 || employee_name=pavan kumar padavala) ";
		PreparedStatement ps = connection.prepareStatement(querry);
		System.out.println("details are deleted successfully");
		ps.executeUpdate();
		connection.close();
		ps.close();
	}
}
