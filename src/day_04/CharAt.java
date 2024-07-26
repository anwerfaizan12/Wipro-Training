package day_04;

import java.util.Scanner;

public class CharAt {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter the String");
	  String str = scn.nextLine();
	  System.out.println("Enter the index");
	  int index = scn.nextInt();
	  if(index >= str.length() || index<0) {
		  System.out.println("Invalid Index");
	  }
	  char ch = str.charAt(index);
	  System.out.println("Char at index "+index+" is "+ch);
  }
}
