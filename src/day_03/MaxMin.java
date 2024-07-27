package day_03;

import java.util.Scanner;

public class MaxMin {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter the size of array - ");
	  int n=scn.nextInt();
	  int [] arr= new int[n];
	  System.out.println("Enter elements of the array - ");
	  for(int i=0;i<n;i++) {
		  arr[i]=scn.nextInt();
	  }
	  
	  int max=arr[0];
	  int min =arr[0];
	  
	  for(int i=1;i<arr.length;i++) {
		  if(arr[i]<min) {
			  min=arr[i];
		  }
		  if(arr[i]>max) {
			  max = arr[i];
		  }
	  }
	  
	  System.out.println("Maximum value - "+max);
	  System.out.println("Minimum value - "  +min);
  }
}
