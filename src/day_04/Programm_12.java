package day_04;

import java.util.Arrays;
import java.util.Scanner;

public class Programm_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String str  =scn.nextLine();
		if(str.length()==0) {
			System.out.println("String is empty");
			return;
		}
		str = str.trim();
		
		char[] arr =str.toCharArray();
		Arrays.sort(arr);		
		
		String res = new String(arr);
		
		System.out.println("Sorted array is -> "+res);
}
}
