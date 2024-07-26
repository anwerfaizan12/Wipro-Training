package day_04;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Programm_08 {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		if(str.length()==0) {
			System.out.println("String is empty");
			return;
		}
		str = str.trim();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(map.containsKey(ch)) {
				int f= map.get(ch);
				map.put(ch, f+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		System.out.println("Duplicate charcters of the string are ");
		
		for(char key : map.keySet()) {
			int f = map.get(key);
			if(f>1) {
				System.out.println(key);
			}
		}
	}
}
