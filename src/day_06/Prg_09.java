package day_06;

import java.io.File;
import java.io.FileInputStream;

public class Prg_09 {

	
	 public static void main(String[] args) throws Exception  {
        
		 File f = new File("C:\\Users\\Administrator\\Desktop\\f5.txt");
		 
		 
		 FileInputStream in = null;
		 String sum ="";
			 in = new FileInputStream(f);
			 
			 int c;		
			 while((c = in.read()) != -1) {
				 System.out.print((char)c);
				 sum+=(char)c;
			 }
			 
			 if(sum.length()==0) {
				 throw new Exception("File is empty");
			 }
	 }

}
