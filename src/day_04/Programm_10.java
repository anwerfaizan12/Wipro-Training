package day_04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programm_10 {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		if(str.length()==0) {
			System.out.println("String is empty");
			return;
		}
		str = str.trim();
		
		Set<Character> set = new HashSet<>();
		char res = ' ';
		
		for(int i=0;i<str.length();i++) {
			char ch  = str.charAt(i);
			if(set.contains(ch)) {
				res = ch;
				break;
			}
			else {
				set.add(ch);
			}
		}
		
		System.out.println("First repeating character is -> "+res);
	}
}
