package day_07;

import java.util.LinkedList;

public class LinkedList4 {
	 public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList();
		 
		 list.add("India");
		 list.add("Pakistan");
		 list.add("Srilanka");
		 list.add("Nepal");
		 list.add("Afghanistan");
		 
		 System.out.println("The Linked list is ");
		 System.out.println(list);
		 
		 list.removeFirst();
		 
		 System.out.println("Now the linked list is");
		 System.out.println(list);
	 }
}
