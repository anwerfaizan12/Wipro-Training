package day_02;

import java.util.Scanner;

public class breakStatement {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter the number - ");
	  int n= scn.nextInt();
	  for(int i=2;i<=n;i++) {
		  if(n%i==0) {
			  System.out.println("Got the first divisor - "+i);
			  break;
		  }
	  }
  }
}
