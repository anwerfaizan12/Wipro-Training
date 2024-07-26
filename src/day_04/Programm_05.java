package day_04;

import java.util.Scanner;

public class Programm_05 {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		if(str.length()==0) {
			System.out.println("String is empty");
			return;
		}
		str = str.trim();
		
	    String[] arr = str.split(" ");
	    
	    System.out.println("Capitalized words of the string are ");
	    
	    for(String s : arr) {
	    	char ch = s.charAt(0);
	    	if(ch>='A' && ch<='Z') {
	    		System.out.println(s);
	    	}
	    }
		
		
	}
}
