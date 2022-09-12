package CollectionFramework;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;
public class EmployeesDetails {
 public static void main(String[] args) throws Exception {
	FileReader fr=new FileReader(new File("Employee.details"));
	Properties employeedetails = new Properties();
	employeedetails.load(fr);
	System.out.println("employee name,salary = "+employeedetails.getProperty("1373"));
}
}
