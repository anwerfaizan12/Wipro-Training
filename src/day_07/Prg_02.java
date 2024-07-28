package day_07;

import java.util.ArrayList;

public class Prg_02 {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList();
	list.add(2);
	list.add(2);
	list.add(null);
	list.add(4);
	list.add(9);
	
	int i=0;
	while(i<list.size()){
		if(list.get(i)!=null) {
		System.out.println(list.get(i));
		}
		i++;
	}
}
}
