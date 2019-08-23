package iostream;

import java.io.*;
import java.util.Scanner;

public class SimpleEncryption {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source file");
		String source = sc.next();
		System.out.println("Enter destination file");
		String dest = sc.next();
		System.out.println("Enter shift size");
		int shiftsize = sc.nextInt();
		try {
			encrypt(source, dest,shiftsize);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void encrypt(String source, String dest, int shiftsize) throws FileNotFoundException,IOException {
		BufferedReader in;
		BufferedWriter out;
		in =  new BufferedReader(new FileReader(source));
		out = new BufferedWriter(new FileWriter(dest));
		String reader = in.readLine();
		int data ;
		Boolean isVowel;
		while(reader != null) {
			int vowel =0;
			for(int i=0;i<reader.length();i++) {
				data =  reader.charAt(i);
				isVowel=findVowel(data);
				data = (int) reader.charAt(i) + shiftsize;
				
				out.write(data);
				if(isVowel)
					vowel++;
			}
			System.out.println("The number of vowels in the line is"+vowel);
			reader=in.readLine();
			
		}
		out.close();
		reader=in.readLine();
		
	}
	public static Boolean findVowel(int data) {
		char ch = (char)data;
		//System.out.println(ch);
		if(ch=='A'|| ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'||ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
			return true;
		}
		return false;
		
	}
	

}
