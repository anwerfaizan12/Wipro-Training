package day_04;

import java.util.Scanner;

public class Programm_06 {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("Enter first string");
		String str1 = scn.nextLine();
		
		System.out.println("Enter second string");
		String str2 = scn.nextLine();
		
		boolean res = str1.equals(str2);
		
		if(res == true) {
		System.out.println("Strings are equal");
		}
		else {
			System.out.println("String are not equal");
		}
	}
}
