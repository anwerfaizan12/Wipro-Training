package day_04;

import java.util.Scanner;

public class ToUpperCase {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the String");
		  String str = scn.nextLine();
		  String res = str.toUpperCase();
		  System.out.println("upeercase string is");
		  System.out.println(res);
	  }
	  
}
