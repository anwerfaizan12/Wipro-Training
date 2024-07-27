package day_03;

import java.util.Scanner;

public class Vowels {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter the string - ");
	  String str = scn.nextLine();
	  str=str.toLowerCase();
	  int count=0;
	  for(int i=0;i<str.length();i++) {
		  char ch =str.charAt(i);
		  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch == 'u') {
			  count++;
		  }
	  }
	  System.out.println("Number of vowels in the String - "+count);
  }
}
