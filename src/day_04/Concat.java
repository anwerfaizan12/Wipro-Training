package day_04;

import java.util.Scanner;

public class Concat {
 public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Enter first string");
	 String s1 = scn.nextLine();
	 System.out.println("Enter second string");
	 String s2 = scn.nextLine();
	 String res = s1.concat(s2);
	 System.out.println(res);
 }
}
