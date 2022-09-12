package CollectionCursors;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationCursor {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector();
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
			
		}
		
	}
}
