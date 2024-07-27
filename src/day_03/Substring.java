package day_03;

import java.util.Scanner;

public class Substring {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter the string");
	  String str = scn.nextLine();
	  System.out.println("Enter first index");
	  int fi = scn.nextInt();
	  System.out.println("Enter second index");
	  int si = scn.nextInt();
	  if(str.length()<=1) {
		  System.out.println("String is empty");
		  return;
	  }
	  if(fi== -1 || si== -1 || fi>=str.length() || si>= str.length()) {
		  System.out.println("Invalid indices");
		  return;
	  }
	  if(fi >= si) {
		  System.out.println("First index must be smaller than second index");
	      return;
	  }
	  String subStr = str.substring(fi,si);
	  System.out.println(subStr);
  }
}
