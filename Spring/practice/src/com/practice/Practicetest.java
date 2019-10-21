package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Practicetest {

	public static void main(String[] args) {
		
//		String a =" Happy ";
//		System.out.println("/**");
//		for(int i=0; i<a.length();i++)
//			System.out.println(a.charAt(i));
//
//		System.out.println("**\");
	
		
//		interface queen {
//			float ment(int a,int y);
//		}
//		
//		class elep implements queen{
//
//			
//			public static float ment(int a, int y) {
//				
//				return (float) a*3;
//			}
//			
//		}
//		
	Map <String, String> map = new HashMap<String,String>();
	map.put("key1","red");
	map.put("key2", "blue");
	map.put("key3", "green");
	for(String key : map.keySet()) {
		String val = map.get(key);
		System.out.println(val);
	}
		
		
		
	}
	

}
