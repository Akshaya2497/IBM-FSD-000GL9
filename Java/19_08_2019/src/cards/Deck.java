package cards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashMap.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//import java.util.HashMap.clear;


public class Deck {
	 
	static List<Card> card =  new ArrayList<Card>();
	static List<Card> demo =  new ArrayList<Card>(); 
	private static  Suit suit ;
	private static Rank rank ;
	 
	
	
	static {
		for(Suit s:suit.values()) {
			for(Rank r : rank.values()) {
				card.add(new Card(s,r));
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, List> person = new HashMap<String, List>();
		System.out.println(card);
		Collections.shuffle(card);
		System.out.println("Enter the number of hands");
		Scanner sc = new Scanner(System.in);
		int hands = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the number of cards per hand");
		int perHand = sc.nextInt();
		String ch = "A";
		for(int h=0;h<hands;h++) {
			int ph=0;
				Iterator<Card> str =card.iterator();
				while(str.hasNext() && ph<perHand) {
					demo.add(str.next());
					
					ph++;
				}
				person.put(ch, demo);
				
				System.out.println(person);
				person.clear();
				demo.removeAll(card);
				//person.remove(ch);
				ch+='B';
				Collections.shuffle(card);
				
			}
		}
		
	}


