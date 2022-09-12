package CollectionFramework;

import java.io.File;
import java.io.FileReader;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import java.util.Properties;

public class Annotation2 {
	public static void main(String[] args) throws Exception {

		Annotation1 aa = new Annotation1();
		FileReader fr = new FileReader(new File("Employee.details"));
		Properties props = new Properties();
		props.load(fr);
		Class<?> classOfClass = aa.getClass();

		for (Field field : classOfClass.getDeclaredFields()) {
			field.setAccessible(true);
			Class<?> type = field.getType();

			if (field.isAnnotationPresent(Similar.class)) {
				if (type.equals(int.class)) {
					int value = Integer.parseInt(props.getProperty(field.getName()));
					field.set(aa, value);
//				if (props.containsKey(field.getAnnotation(Similar.class).keyValue())) {
//					field.set(aa, props.getProperty(field.getAnnotation(Similar.class).keyValue())); 
//				} else {
					// field.set(aa, props.getProperty(field.getName()));
				} else if (type.equals(String.class)) {
					field.set(aa, props.getProperty(field.getName()));
				}
			}

			else {
				if (type.equals(int.class)) {
					int value = Integer.parseInt(props.getProperty(field.getName()));
					field.set(aa, value);
				} else if (type.equals(String.class)) {
					field.set(aa, props.getProperty(field.getName()));
				}
			}

		}
		System.out.println("employee[employee_name="+aa.getEmployee_name()+",employee_id="+aa.getEmployee_id()+",employee_salary="+aa.getEmployee_salary()+"]");

	}
}
