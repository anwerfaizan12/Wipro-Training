package day_02;

import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		int sum = 0;
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the number - ");
		  int n= scn.nextInt();
		  for(int i=2;i<=n;i++) {
			  if(n%i==0) {
				  continue;
			  }
			  sum+=i;
		  }
		  System.out.println("Sum of all non divisors is - " + sum);
	  }
}
