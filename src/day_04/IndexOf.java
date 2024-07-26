package day_04;

import java.util.Scanner;

public class IndexOf {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter the String");
	  String str = scn.nextLine();
	  System.out.println("Enter the sequence");
	  String seq = scn.nextLine();
	  
	  int index = str.indexOf(seq);
	  System.out.println(index);
  }
}
