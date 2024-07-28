package day_07;

import java.util.HashSet;

public class HashSet2 {
	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<String>();
		 
		 set.add("Aleena");
		 set.add("Mariya");
		 set.add("Sameera");
		 set.add("Iqra");
		 set.add("Ifra");
		 
		 System.out.println("The set is ");
		 System.out.println(set);
		 		
		 System.out.println("set contains Aleena -> "+set.contains("Aleena"));
		 System.out.println("set contains faizan -> " +set.contains("faizan"));
		 }
}
