package day_04;

import java.util.Scanner;

public class Trim {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the String");
		  String str = scn.nextLine();
		  String res = str.trim();
		  System.out.println("String after trim");
		  System.out.println(res);
	  }
}
