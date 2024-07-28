package day_07;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<String>();
		 
		 list.add("Aleena");
		 list.add("Mariya");
		 list.add("Sameera");
		 list.add("Iqra");
		 list.add("Ifra");
		 
		 System.out.println("The Array list is ");
		 System.out.println(list);
		 
		 list.set(0,"Divya");
		 
		 System.out.println("The elements of the list are");
		 for(String str:list) {
			 System.out.println(str);
		 }
		 }
}
