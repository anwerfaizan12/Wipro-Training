package day_04;

import java.util.Scanner;

public class IsEmpty {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scn.nextLine();
		System.out.println(s1.isEmpty());
	}
}
