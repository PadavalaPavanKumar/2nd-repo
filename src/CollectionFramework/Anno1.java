package CollectionFramework;
import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;
import CollectionFramework.Annotation1;
public class Anno1 {
	public static void main(String[] args) throws Exception {
		Annotation1 aa=new Annotation1();
		Class<?> classOfClass =aa.getClass();
		Map<String,String> hashMap=new HashMap();
		
		for(Field field:classOfClass.getDeclaredFields()) {
		field.setAccessible(true);
		if(field.isAnnotationPresent(Similar.class)){
			hashMap.put(field.getAnnotation(Similar.class).keyValue(),field.get(aa).toString());
		}
		else {
			hashMap.put(field.getName(),field.get(aa).toString());
		}
		}
		System.out.println(hashMap);
	}

	
}
