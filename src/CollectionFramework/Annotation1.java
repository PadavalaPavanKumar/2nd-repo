package CollectionFramework;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Annotation1 {
// public Annotation1(String id1,String name1,String salary1) {
//	 employee_id=id1;
//	 employee_name=name1;
//	 employee_salary=salary1;
//	
//}
	

	@Similar(keyValue = "id")
	private String employee_id;

  @Similar(keyValue = "salary")
	private int employee_salary;

	@Similar(keyValue = "name")
	private String employee_name;

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public int getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	@Override
	public String toString() {
		return "Annotation1 [employee_id=" + employee_id + ", employee_salary=" + employee_salary + ", employee_name="
				+ employee_name + "]";
	}

	

}
