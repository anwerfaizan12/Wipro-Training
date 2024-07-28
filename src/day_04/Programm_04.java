package day_04;

import java.util.Scanner;
import java.util.HashSet;

public class Programm_04 {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		if(str.length()==0) {
			System.out.println("String is empty");
			return;
		}
		str = str.trim();
		
		HashSet<Character> set = new HashSet<Character>();
		StringBuilder res = new StringBuilder("");
		
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!set.contains(ch)) {
				res.append(ch);
				set.add(ch);
			}
		}
		
		System.out.println("String after removing duplicates is -> "+res);
	}
}
