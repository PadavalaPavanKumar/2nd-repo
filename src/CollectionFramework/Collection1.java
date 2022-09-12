package CollectionFramework;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.ArrayList;

public class Collection1 {
	public static void main(String[] args) {
		Collection<Integer> c = new LinkedList<Integer>();
		Collection<String> s = new ArrayList<String>(3);
		Vector<String> s1 = new Vector<String>(3);
		c.add(2);
		c.add(7);
		c.remove(0);
		s.add("pavan");
		s.add("kumar");
		s.add("padavala");
		s.add("pp");
		s1.add("ff");
		s1.addAll(s);

		s1.addElement("pppp");
		System.out.println(c);
		System.out.println(s1);

	}
}
