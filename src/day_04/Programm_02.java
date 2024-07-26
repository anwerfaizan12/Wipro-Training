package day_04;

import java.util.Scanner;

public class Programm_02 {
   public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	   System.out.println("Enter the String");
	   String str = scn.nextLine();
	   if(str.length()==0) {
		   System.out.println("String is empty");
		   return;
	   }
	   String trimmedString = str.trim();
	   System.out.println("Trimmed String is -> " +trimmedString);
   }
}
