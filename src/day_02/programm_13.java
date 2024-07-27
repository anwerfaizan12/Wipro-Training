package day_02;

import java.util.Scanner;

public class programm_13 {
	public static void  main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 System.out.println("Enter the number - ");
		 int n=scn.nextInt();
		 if(n==0) {
			 System.out.println("Number is zero");
		 }
		 else if(n>0) {
			 System.out.println("Number is positive");
		 }
		 else {
			 System.out.println("Number is negative");
		 }
	 }
}
