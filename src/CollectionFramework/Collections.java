package CollectionFramework;
  import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.Vector;
  import java.util.Hashtable;
public class Collections {
  public static void main(String[] args) {
	  ArrayList o =new ArrayList();
	  ArrayList o1=new ArrayList();
	 o.add(1);
	  o.add(1);
	  o.add(2);
	  o.add("pavan");
	  o.addAll(o);
	  o1.addAll(o);
	System.out.println( o.contains(o1));
	  o.add(88);
	 o1.add(99);
	  o.retainAll(o1);
	  o.removeAll(o1);
	System.out.println(o);
	  System.out.println(o.isEmpty());
	  System.out.println(o1);
  }
}
 