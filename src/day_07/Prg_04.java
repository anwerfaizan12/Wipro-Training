package day_07;

import java.util.HashSet;

public class Prg_04 {
	public static void main(String[] args) {
		 HashSet<Integer> set = new HashSet<Integer>();
		 
		 set.add(1);
		 set.add(4);
		 set.add(3);
		 set.add(3);
		 set.add(5);
		 set.add(11);
		 set.add(44);
		 set.add(38);
		 set.add(23);
		 set.add(5);
		 
		 System.out.println("Elements of set are ");
		 for(int i:set) {
		 		 System.out.print(i+"  ");
		 }
	     System.out.println();
	     System.out.println();
	     
	     System.out.println("5 is present in set -> "+set.contains(5));
	     System.out.println("100 is present in the set ->  "+set.contains(100));
	
	     System.out.println();
	     set.remove(5);
	     System.out.println("The set after removing");
	     System.out.println(set);
	}
}