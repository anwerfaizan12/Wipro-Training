// name : faizan anwer
// date : 15/07/2024
// description : calculating average of three numbers

package day_01;

import java.util.Scanner;

public class Prg4 {
	 public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter first number");
			int n1 = scn.nextInt();
			
			System.out.println("Enter second number");
			int n2 = scn.nextInt();
			
			System.out.println("Enter third number");
			int n3 = scn.nextInt();
			
			// calculating average
			double avg = (n1+n2+n3) / (double)3;
			System.out.println("Average is -> "+avg);
	 }
}
