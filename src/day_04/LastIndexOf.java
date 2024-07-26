package day_04;

import java.util.Scanner;

public class LastIndexOf {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the String");
		  String str = scn.nextLine();
		  System.out.println("Enter the character");
		  char ch = scn.next().charAt(0);
		  
		  int index = str.lastIndexOf(ch);
		  System.out.println(index);
	  }
}
