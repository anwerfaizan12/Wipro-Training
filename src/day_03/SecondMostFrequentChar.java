package day_03;

import java.util.Scanner;
import java.util.*;

public class SecondMostFrequentChar {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the string");
		  String str = scn.nextLine();
		  if(str.length()==0) {
			  System.out.println("String is empty");
			  return;
		  }
		  Map<Character,Integer> map = new HashMap<>();
		  for(int i=0;i<str.length();i++) {
			  char ch =  str.charAt(i);
			  if(map.containsKey(ch) == true) {
				  int f= map.get(ch);
				  map.put(ch,f+1);
			  }
			  else {
				  map.put(ch,1);
			  }
		  }
		  
		  if(map.size() == 1) {
			  System.out.println("This string contains only one character");
			  return;
		  }
		  
		  int max1 = 0;
		  int max2 = 0;
		  
		  for(char ch :map.keySet()) {
			  int freq = map.get(ch);
			  if(freq>max1) {
				  max2 = max1;
				  max1=freq;
			  }
			  else if(freq>max2) {
				  max2=freq;
			  }
		  }
		  
		  System.out.println(max2);
	  }
}
