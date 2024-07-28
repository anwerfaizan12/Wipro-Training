package day_07;

import java.util.HashMap;

public class Prg_05 {
	 public static void main(String[] args) {
		 HashMap<String,Integer> map = new HashMap<>();
		 
		 map.put("Aleena", 98);
		 map.put("Sameera", 67);
		 map.put("Ifra", 87);
		 map.put("Mariya", 56);
		 map.put("Kashish", 50);
	 
		 System.out.println("The map is");
		 for(String str : map.keySet()) {
			 int value = map.get(str);
			 System.out.println(str+ " : "+value );
		 }
		 
		 System.out.println();
		 map.put("Kashish", 60);
		 System.out.println("The updated map is");
		 for(String str : map.keySet()) {
			 int value = map.get(str);
			 System.out.println(str+ " : "+value );
		 }		
	 }
}