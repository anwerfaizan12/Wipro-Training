package day_06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Prg_07 {

	
	 public static void main(String[] args) throws Exception  {
        
		 File f = new File("C:\\Users\\Administrator\\Desktop\\f3.txt");
		 
		 
		 FileInputStream in = null;
		 try {
			 in = new FileInputStream(f);
			 
			 int c;		
			 while((c = in.read()) != -1) {
				 System.out.print((char)c);
			 }
			 
		 }
		 
		 catch(Exception e) {
			 System.out.println("File not found : "+e);
		 }
		 finally{
			 if(in != null) {
				 try {
					in.close();
				}
				 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
	 }

}
