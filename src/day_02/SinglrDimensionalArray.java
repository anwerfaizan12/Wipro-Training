package day_02;

import java.util.Arrays;

public class SinglrDimensionalArray {
 public static void main(String[] args)
{
	 int [] arr= {1,4,3,5,2,8,9,6,7,10};
	 System.out.println("Elements of the array - ");
	 for(int number:arr) {
		 System.out.print(number+"  ");
	 }
	 
	 System.out.println();
	 
	 Arrays.sort(arr);
	 
	 System.out.println("Array elements after sorting - ");
	 for(int val:arr) {
		 System.out.print(val+"  ");
	 }
	 
	 }
}
