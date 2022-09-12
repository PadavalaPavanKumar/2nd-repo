package CollectionCursors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorCursor {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList();
	a.add("pavan");
	a.add("kumar");
	a.add("pp");
	a.add("padavala");
	System.out.println(a);
		  Iterator itr = a.iterator();
		  while(itr.hasNext()) {
		 String s=(String)itr.next();
		 if(s.length()<3) {
			 System.out.println(s);
		 }else {
			 itr.remove();
		 }
		  }
		  System.out.println(a);
	  }
}
  

