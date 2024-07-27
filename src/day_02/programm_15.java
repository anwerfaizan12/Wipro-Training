// name : faizan anwer
// date : 15/07/2024
// description : comparing two floating numbers 

package day_02;

import java.util.Scanner;

public class programm_15 {
 public static void main(String[] args) {
	 Scanner scn  =new Scanner(System.in);
	 
	 System.out.println("Enter first floating number");
	 double num1 = scn.nextDouble();
	 
	 System.out.println("Enter second floating number");
	 double num2 = scn.nextDouble();
	 
	 if(Math.abs(num1 - num2)<=0.01) {
		 System.out.println("These numbers are same");
	 }
	 else {
		 System.out.println("These numbers are different");
	 }
 }
}
