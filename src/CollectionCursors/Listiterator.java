package CollectionCursors;
import java.util.*;
public class Listiterator {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	for(int i=3;i<=12;i++) {
		a.add(i);
	}
	System.out.println(a);
	
	ListIterator ltr =a.listIterator();
	while(ltr.hasNext()) {
		Integer i1=(Integer)ltr.next();
		System.out.print(i1+" ");
	}
	System.out.println();
	while(ltr.hasPrevious()) {
		
		
		Integer i1=(Integer)ltr.previous();
		System.out.print(i1+" ");
	}
}
}
