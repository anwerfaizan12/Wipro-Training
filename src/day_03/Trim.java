package day_03;

import java.util.Scanner;

public class Trim {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the string");
		  String str = scn.nextLine();
		  if(str.length()==0) {
			  System.out.println("String is empty");
			  return;
		  }
		  String trimmedString = str.trim();
		  System.out.println("Trimmed string is ");
		  System.out.println(trimmedString);
	  }
}
