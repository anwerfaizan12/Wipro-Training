package day_04;

import java.util.Scanner;

public class Programm_01 {
  // substring at two specified positions
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = scn.nextLine();
		
		System.out.println("Enter first index");
		int index1 = scn.nextInt();

		System.out.println("Enter second index");
		int index2 = scn.nextInt();
		
		if(str.length()==0 || str.length() ==1) {
			System.out.println("Please enter a string with minimum length of 2");
			return;
		}
		if(index1< 0 || index2 <0 || index1 >= index2 || index1 >=str.length() || index2>= str.length()) {
			System.out.println("Plese enter valid index");
			return;
		}
		
		String s = str.substring(index1,index2);
		System.out.println(s);
	}
	
}
