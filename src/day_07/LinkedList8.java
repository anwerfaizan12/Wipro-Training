package day_07;

import java.util.LinkedList;

public class LinkedList8 {
	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<String>();
		 
		 list.add("Aleena");
		 list.add("Mariya");
		 list.add("Sameera");
		 list.add("Iqra");
		 list.add("Ifra");
		 
		 System.out.println("The linked list is ");
		 System.out.println(list);
		 
		 System.out.println("The first element of the list is "+list.getFirst());
		 
		 }
}