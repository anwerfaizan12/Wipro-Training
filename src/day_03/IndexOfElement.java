package day_03;

import java.util.Scanner;

public class IndexOfElement {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
		 System.out.println("Enter size of the array - ");
		 int n= scn.nextInt();
		 int [] arr = new int[n];
		 System.out.println("Enter elements of the array - ");
		 for(int i=0;i<arr.length;i++){
			 arr[i] = scn.nextInt();
		 }
		 
		 int index=-1;
		 System.out.println("Enter the number to find index - ");
		 int d= scn.nextInt();
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==d) {
				 index=i;
				 break;
			 }
		 }
		 
		 if(index==-1) {
			 System.out.println("Element not found");
		 }
		 else {
			 System.out.println("Index of the element is -> "+index);
		 }
  }
}
