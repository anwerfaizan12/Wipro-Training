package day_08;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class Prg_01_Deserialization {
 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 try (FileInputStream in = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\faizu");
	     ObjectInputStream  objIn = new ObjectInputStream(in)){
	     List<Messasge> msg = (List<Message>) objIn.readObject();
	     for(Message i : msg) {
	    	 System.out.println(i);
	     }
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
 }
}
