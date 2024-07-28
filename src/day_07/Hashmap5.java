package day_07;

import java.util.HashMap;

public class Hashmap5 {
	 public static void main(String[] args) {
		 HashMap<String,String> map = new HashMap<>();
		 
		 map.put("India", "New Delhi");
		 map.put("Pakistan", "Islamabad");
		 map.put("Nepal", "Kathmandu");
		 map.put("Afghanistan", "Kabul");
		 map.put("USA", "Washington");
	 
		 System.out.println("Map elements ");
		 System.out.println(map);
		 System.out.println();
		 
		 System.out.println("Keyset of the map is ");
		 System.out.println(map.keySet());
	 }
}