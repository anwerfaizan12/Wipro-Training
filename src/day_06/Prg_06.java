package day_06;

import java.util.Scanner;

public class Prg_06 {
	static void checkOdd(int n) throws ArithmeticException {
		if(n % 2 !=0) {
			throw new ArithmeticException("This is an odd number");
		}
		
	}
 public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int n = scn.nextInt();
	 if(n<0) {
		 n= n* (-1);
	 }
	 checkOdd(n);
 }
}
