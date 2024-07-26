package day_04;

import java.util.Scanner;

public class Split {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the String");
		  String str = scn.nextLine();
		  String[] res = str.split(" ");
		  
		  
		  System.out.println("String after split is - ");
		  for(String s:res) {
			  System.out.println(s);
		  }
		  
	  }
}
