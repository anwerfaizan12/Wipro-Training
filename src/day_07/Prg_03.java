package day_07;

import java.util.ArrayList;

public class Prg_03 {
	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("Mariya");
	list.add("Aleena");
	list.add("Iqra");
	list.add("Ifra");
	list.add("Divya");
	
	System.out.println("The list is");
	System.out.println(list);
	
	list.remove(2);
	System.out.println();
	System.out.println("Updated list after removing third element is");
	System.out.println(list);
}
}
