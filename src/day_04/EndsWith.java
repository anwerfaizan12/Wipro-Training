package day_04;

import java.util.Scanner;

public class EndsWith {
   public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	   System.out.println("Enter the String");
	   String str = scn.nextLine();
	   System.out.println("Enter the sequence");
	   String seq = scn.nextLine();
	   boolean res = str.endsWith(seq);
	   if(res==true) {
		   System.out.println("This string ends with the sequence "+ seq);
	   }
	   else{
		   System.out.println("This string doesn't end with the sequence "+ seq);
	   }
   }
}
