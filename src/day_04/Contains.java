package day_04;

import java.util.Scanner;

public class Contains {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter the string");
	  String str=scn.nextLine();
	  System.out.println("Enter the sequence");
	  String seq = scn.nextLine();
	  boolean res= str.contains(seq);
	  if(res==true){
		  System.out.println("String contains this sequence");
	  }
	  else
	  {
		  System.out.println("String doesn't contain this sequence");
	  }
	  }
}
