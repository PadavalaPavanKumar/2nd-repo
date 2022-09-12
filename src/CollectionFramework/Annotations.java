package CollectionFramework;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

 @interface Similar {
	public String keyValue()  default"";
}


 