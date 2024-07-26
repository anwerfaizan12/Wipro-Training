package day_04;

import java.util.Arrays;
import java.util.Scanner;

public class Programm_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String str  =scn.nextLine();
		if(str.length()==0) {
			System.out.println("String is empty");
			return;
		}
		str = str.trim();
		
		char[] arr = str.toCharArray();
		
		int left =0;
		int right=str.length()-1;
		
		while(left<right) {
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
		
		String res  =  new String(arr);
		
		System.out.println("The string after swapping -> "+res);
}
}
