// name : faizan anwer
// date : 15/07/2024
//description : printing the table of given number.

package day_01;

import java.util.Scanner;

public class Prg9 {
public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = scn.nextInt();
		 System.out.println("The table is ");
	     for(int i=1;i<=10;i++) {
	    	 System.out.println(n +" * "+i+" = "+n*i);
	     }
	}
}
