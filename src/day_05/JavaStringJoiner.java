package day_05;

import java.util.Scanner;
import java.util.StringJoiner;

public class JavaStringJoiner {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  
		  System.out.println("Enter first String");
		  String s1  = scn.nextLine();
		  
		  System.out.println("Enter second string");
		  String s2 = scn.nextLine();
		  
		  System.out.println("Enter third string");
		  String s3 = scn.nextLine();
		  
		  StringJoiner joinPersons = new StringJoiner(",","{","}");
		  
		  joinPersons.add(s1);
		  joinPersons.add(s2);
		  joinPersons.add(s3);
		  
		  System.out.println("Joined string is");
		  System.out.println(joinPersons);
		  
	  }
}
