package day_02;

import java.util.Scanner;

public class DecisionMaking {
 public static void main(String[] args) {
	 Scanner scn =  new Scanner(System.in);
	 System.out.println("Enter the marks - ");
	 int marks = scn.nextInt();
	 if(marks>90) {
		 System.out.println("Excellent");
	 }
	 else if(marks>80) {
		 System.out.println("Great");
	 }
	 else if(marks>70) {
		 System.out.println("Good");
	 }
	 else {
		 System.out.println("Average");
	 }
 }
}
