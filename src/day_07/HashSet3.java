package day_07;

import java.util.HashSet;

public class HashSet3 {
	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<String>();
		 
		 set.add("Aleena");
		 set.add("Mariya");
		 set.add("Sameera");
		 set.add("Iqra");
		 set.add("Ifra");
		 
		 System.out.println("The set is ");
		 System.out.println(set);
		 
		 set.remove("Ifra");
		 System.out.println("Set after removing Ifra ");
		 System.out.println(set);
		 		 
		 }
}
