package day_07;

import java.util.ArrayList;

public class Wrapper1 {
 public static void main(String[] args) {
	 ArrayList<Integer> l = new ArrayList<Integer>();
	 
	 l.add(10);
	 l.add(20);
	 l.add(30);
	 l.add(40);
	 l.add(50);
	 
	 System.out.println("The list is");
	 System.out.println(l);
	 
	 System.out.println("The elements of the ArrayList are");
	 for(int i: l) {
		 System.out.println(i);
	 }
 }
}
