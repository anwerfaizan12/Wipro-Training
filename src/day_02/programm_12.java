package day_02;

import java.util.Scanner;

public class programm_12 {
 public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n= scn.nextInt();
	 int count=1;
	 System.out.println("Floyd's Triangle - ");
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<=i;j++) {
			 System.out.print(count+" ");
			 count++;
		 }
		 System.out.println();
	 }
 }
}
