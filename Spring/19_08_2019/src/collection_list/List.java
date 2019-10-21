package collection_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class List {
	public static void main(String[] args) {
		Collection <String> list = new ArrayList<String>();
		list.add("akki");
		list.add("aksh");
		Collection <String> set = new HashSet<String>();
		set.add("akki");
		set.add("hello");
		list.addAll(set);
		System.out.println(list);
		Iterator<String> str =list.iterator();
		while(str.hasNext()) {
			System.out.println(str);
		}
		
	}
}
