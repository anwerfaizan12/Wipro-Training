package day_04;

import java.util.Scanner;

public class ToLowerCase {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the String");
		  String str = scn.nextLine();
		  String res = str.toLowerCase();
		  System.out.println("The lowercase string is");
		  System.out.println(res);
	  }
}
