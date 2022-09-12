package JDBC;

import java.sql.Connection;
import java.sql.*;

public class JdbcUpdate {
   public static void main(String[] args) throws Exception {
	Class.forName("org.postgresql.Driver");
	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
	String querry="update  kspl.employees set employee_id=1232 where employee_name='pavan kumar padavala'";
	PreparedStatement ps=connection.prepareStatement(querry);
	ps.executeUpdate();
	ps.close();
}
}
