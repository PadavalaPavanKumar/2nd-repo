package JDBC;

import java.sql.*;
import java.util.Scanner;

public class JdbcInsertValues {
	public static void main(String[] args) throws SQLException,ClassNotFoundException  {

		Scanner sc = new Scanner(System.in);

		System.out.print("insert values : name, project, id : ");
		String name = sc.nextLine();
		String project = sc.nextLine();
		int id = sc.nextInt();

		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
		String querry = "insert into kspl.employees values (?,?,?)";
		// String querry="delete from kspl.employees where employee_id=1111";
		PreparedStatement ps = con.prepareStatement(querry);

		ps.setInt(2, id);
		ps.setString(1, name);
		ps.setString(3, project);
		ps.executeUpdate();
		System.out.println("successfully updated");

		ps.close();
		con.close();
		sc.close();
	}
}
