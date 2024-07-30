package day_08;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileHandlingDemo {
 public static void main(String[] args) {
	 File f = new File("C:\\Users\\Administrator\\Desktop\\f1.txt");
	 File ff = new File("C:\\Users\\Administrator\\Desktop\\f2.txt");
	 
	 
	 FileInputStream in = null;
	 FileOutputStream out = null;
	 try {
		 in = new FileInputStream(f);
		 out = new FileOutputStream(ff);
		 
		 int c;		
		 while((c = in.read()) != -1) {
			 System.out.print((char)c);
			 out.write(c);
		 }
		 
	 }catch(Exception e) {
		 System.out.println("File handling error : "+e);
	 }
	 finally{
		 if(in != null) {
			 try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 if(out != null) {
			 try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
 }
}
