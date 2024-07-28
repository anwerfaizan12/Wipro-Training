package day_07;

import java.util.HashSet;

public class HashSet6 {
	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<String>();
		 
		 set.add("Aleena");
		 set.add("Mariya");
		 set.add("Sameera");
		 set.add("Iqra");
		 set.add("Ifra");
		 
		 System.out.println("Elements of the set are ");
		 for(String s:set) {
		  System.out.println(s);
		 }
}
}