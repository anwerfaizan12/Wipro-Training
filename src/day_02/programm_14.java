package day_02;

import java.util.Scanner;

public class programm_14 {
  public static void main(String[] args)
{
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter first numer - ");
	  int a = scn.nextInt();
	  
	  System.out.println("Enter second numer - ");
	  int b= scn.nextInt();
	  
	  System.out.println("Enter third numer - ");
	  int c= scn.nextInt();
	  
	  if(a==b && b==c) {
		  System.out.println("All numbers are equal");
	  }
	  else if(a!=b && b!=c && a!=c) {
		  System.out.println("All numbers are different");
	  }
	  else {
		  System.out.println("Neither all are equal or different");
	  }
	  }
}
