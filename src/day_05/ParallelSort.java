package day_05;

import java.util.Arrays;
import java.util.Scanner;

public class ParallelSort {
	public static void main(String[] args) {
		  System.out.println("Enter the size of array");
		  
		  Scanner scn = new Scanner(System.in);
		  int n =scn.nextInt();
		  
		  int [] arr = new int[n];
		  
		  System.out.println("Enter elements of the array");
		  for(int i=0;i<arr.length;i++) {
			  arr[i] = scn.nextInt();
		  }
		  
		  System.out.println("Unsorted Array is ");
		  for(int val:arr) {
			  System.out.print(val+" ");
		  }
		  
		  System.out.println();
		  
		  Arrays.parallelSort(arr);
		  
		  System.out.println("Sorted array is");
		  for(int val:arr) {
			  System.out.print(val+" ");
		  }
	  }
}
