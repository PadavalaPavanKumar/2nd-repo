package CollectionCursors;
import java.lang.Cloneable;
public class cloneable implements Cloneable {
  public static void main(String[] args) {
	  cloneableClass1 cc=new cloneableClass1(23,"pavan") ;
	cloneableClass1 cc1=(cloneableClass1)cc.clone();
}
}
class cloneableClass1{
	int age;
	String name;
	cloneableClass1(int age,String name) {
		this.age=age;
		this.name=name;
	}
	void display() {
		System.out.println(age+name);
	}
}