package day_04;

import java.util.Scanner;

public class Programm_07 {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		int l = str.length();
		System.out.println("Number of characters in the string is -> "+l);
	}
}
