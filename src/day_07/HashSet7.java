package day_07;

import java.util.HashSet;

public class HashSet7 {
	public static void main(String[] args) {
		 HashSet<Integer> set = new HashSet<Integer>();
		 
		 set.add(1);
		 set.add(4);
		 set.add(67);
		 set.add(9);
		 set.add(71);
		 
		 System.out.println("The set is ");
		 System.out.println(set);
		 System.out.println();
		 
		 for(int i=1;i<=10;i++) {
			 if(set.contains(i)) {
				 System.out.println("This number "+i+" was found in the set");
			 }
			 else {
				 System.out.println("This number "+i+" was not found in the set");
			 }
		 }
		 		 
		 }
}
