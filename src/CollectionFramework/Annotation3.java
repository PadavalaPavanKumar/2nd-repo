package CollectionFramework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Annotation3 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(new File("Employee.details"));
		Properties props = new Properties();
		props.load(fr);

		Annotation1 aa = new Annotation1();
		Class<?> classOfClass = aa.getClass();
		Map<String, String> resultHashMap = new HashMap<>();

		for (Field field : classOfClass.getDeclaredFields()) {
		//field.setAccessible(true);
		if (field.isAnnotationPresent(Similar.class)) {

					resultHashMap.put(field.getAnnotation(Similar.class).keyValue(),props.getProperty(field.getName()));
				
			} else {
				resultHashMap.put(field.getName(), props.getProperty(field.getName()));
			}
		}
		System.out.println(resultHashMap);
	}

}
