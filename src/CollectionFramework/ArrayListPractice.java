package CollectionFramework;

import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {

		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add("pavan");
		System.out.println(arrayList.hashCode());
		System.out.println(arrayList.lastIndexOf(arrayList));

		System.out.print("");

		String s = "pavan";
		System.out.println(s.codePointAt(1));
		s.codePointAt(1);
		System.out.println(s.compareTo("jpavanshhh"));
		System.out.println(s.substring(0, 4));
		System.out.println(s.valueOf(2));
		s.toUpperCase();
//	System.out.println( s.isBlank());
		System.out.println(s.substring(1, 3));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('a', 2));
	System.out.println(	s.repeat("1"));
	}

}
