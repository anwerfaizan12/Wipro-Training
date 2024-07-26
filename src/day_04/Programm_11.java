package day_04;

import java.util.Scanner;

public class Programm_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String str  =scn.nextLine();
		if(str.length()==0) {
			System.out.println("String is empty");
			return;
		}
		str = str.trim();
		boolean upperCase = false;
		boolean lowerCase = false;
		
		for(int i=0;i<str.length();i++) {
		char ch= str.charAt(i);
		if(ch>='a' && ch<= 'z') {
			lowerCase = true;
		}
		if(ch>='A' && ch<='Z') {
			upperCase=true;
		}
	}
	
	if(upperCase ==true && lowerCase ==true) {
		System.out.println("This string contains both Uppercase and Lowercase characters");
	}
	else if(upperCase ==true && lowerCase ==false) {
		System.out.println("This string contains Uppercase characters only");
	}
	
	if(upperCase ==false && lowerCase ==true) {
		System.out.println("This string contains Lowercase characters only");
	}
	
}
}
