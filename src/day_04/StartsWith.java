package day_04;

import java.util.Scanner;

public class StartsWith {
	public static void main(String[] args) {
		   Scanner scn = new Scanner(System.in);
		   System.out.println("Enter the String");
		   String str = scn.nextLine();
		   System.out.println("Enter the sequence");
		   String seq = scn.nextLine();
		   boolean res = str.startsWith(seq);
		   if(res==true) {
			   System.out.println("This string starts with the sequence "+ seq);
		   }
		   else{
			   System.out.println("This string doesn't start with the sequence "+ seq);
		   }
	   }
}
