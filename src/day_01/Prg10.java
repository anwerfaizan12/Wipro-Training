// name : faizan anwer
// date : 15/07/2024
// description : printing a triangle with numbers

package day_01;

import java.util.Scanner;

public class Prg10 {
public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = scn.nextInt();
		
		
		System.out.println("The triangle is");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
