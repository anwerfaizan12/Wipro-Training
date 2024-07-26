package day_04;

import java.util.Scanner;
public class Replace {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the String");
		  String str = scn.nextLine();
		  System.out.println("Enter the sequence to replace");
		  String seq = scn.nextLine();
		  System.out.println("Enter the new sequence");
		  String newSeq = scn.nextLine();
		  
		  String replacedString = str.replace(seq,newSeq);
		  System.out.println("String after replacement is -> "+replacedString);
	  }
}
