package day_02;

import java.util.Scanner;

public class WhileLoop {
   public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	   System.out.println("Enter the number - ");
	   int n=scn.nextInt();
	   boolean isPrime = true;
	   int i=2;
	   while(i*i<=n) {
		   if(n%i==0) {
			   isPrime=false;
			   break;
		   }
		   i++;
	   }
	   if(isPrime) {
		   System.out.println("Prime number");
	   }
	   else {
		   System.out.println("Not a prime number");
	   }
   }
}
