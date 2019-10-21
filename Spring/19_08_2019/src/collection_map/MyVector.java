package collection_map;

import java.util.Enumeration;
import java.util.Vector;

public class MyVector {
	private Vector <String> vector;
	public MyVector() {
		vector = new Vector<String>();
		vector.add("a");
		vector.add("b");
		vector.add("c");
		vector.add("d");
		Enumeration <String> e = vector.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
}
