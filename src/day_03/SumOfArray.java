package day_03;

import java.util.Scanner;

public class SumOfArray {
 public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Enter size of the array - ");
	 int n= scn.nextInt();
	 int [] arr = new int[n];
	 System.out.println("Enter elements of the array - ");
	 for(int i=0;i<arr.length;i++){
		 arr[i] = scn.nextInt();
	 }
	 
	 int sum=0;
	 for(int i=0;i<arr.length;i++) {
		 sum+=arr[i];
	 }
	 System.out.println("Sum of the elements of the array is - "+sum);
 }
}
