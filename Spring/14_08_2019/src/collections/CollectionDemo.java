package collections;

import java.util.HashSet;
//import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionDemo {
	static Scanner sc =  new Scanner(System.in);
	private Set <String> set;
	private String str[];
	public CollectionDemo() {
		System.out.println("enter number of elements");
		str = new String[(sc.nextInt())];
		for(int i=0;i<str.length;i++) {
			System.out.println("Name : ");
			str[i]=sc.next().toString().toLowerCase();
		}
		
	
	set = new HashSet<String>();
	for(String s:str) {
		if(!set.add(s)) {
			System.out.println("Duplicate elements found");
		}
	}
	}


public void display() {
	for(String s:set) {
		System.out.println(s.toString());
		
	}
	Iterator <String> i= set.iterator();
	while(i.hasNext()) {
		System.out.println(i.next().toString());
	}
}}
