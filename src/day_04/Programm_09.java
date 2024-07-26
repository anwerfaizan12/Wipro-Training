package day_04;

import java.util.Scanner;

public class Programm_09 {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		if(str.length()==0) {
			System.out.println("String is empty");
			return;
		}
		str =str.trim();
         
		StringBuilder res = new StringBuilder(""); 
		int count=1;
		int i=0;
		while(i<str.length()-1) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}
			else {
				char ch = str.charAt(i);
				res.append(ch);
				if(count>1) {
					res.append(count);
					count=1;
				}
			}
			i++;
		}
		
		res.append(str.charAt(str.length()-1));
		if(count>1) {
			res.append(count);
		}
		
		System.out.println("The compressed string is -> "+res);
	}
}
