package day_07;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Aleena");
        list.add("Sameera");
        list.add("Mariya");
        list.add("Iqra");
        
        System.out.println("The ArrayList is ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
