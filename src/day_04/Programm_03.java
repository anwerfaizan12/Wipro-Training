package day_04;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Programm_03 {
		   public static void main(String[] args) {
			   Scanner scn = new Scanner(System.in);
			   System.out.println("Enter the String");
			   String str = scn.nextLine();
			   if(str.length()==0) {
				   System.out.println("String is empty");
				   return;
			   }
			   
			   str= str.trim();
			   
			   Map<Character,Integer> map = new HashMap();
			   
			   int max1freq = 0;
			   int max2freq = 0;
			   
			   char max1f =' ' ;
			   char max2f =' ';
			   
			   for(int i=0;i<str.length();i++) {
				   char ch = str.charAt(i);
				   if(map.containsKey(ch)) {
					   int frequency = map.get(ch);
					   map.put(ch, frequency+1);
				   }
				   else {
					   map.put(ch, 1);					   
				   }
			   }
			   
			   for(char key : map.keySet()) {
				   int f = map.get(key);
				   
				   if(f>max1freq) {
					   max2freq = max1freq;
					   max2f = max1f;
					   
					   max1freq = f;
					   max1f = key;   
				   }
				   else if(f>max2freq) {
					   max2freq = f;
					   max2f = key;
				   }
			   }
			   
			   System.out.println("Character with second maximum frequency is  -> "+max2f);
			   }
}
