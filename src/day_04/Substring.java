package day_04;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the String");
		  String str = scn.nextLine();
		  
		  
		  // index must be >=0 and <str.length()
		  String substr = str.substring(1,5);
		  System.out.println(substr);
		  
		  String ss =str.substring(2);
		  System.out.println(ss);
	  }
}
