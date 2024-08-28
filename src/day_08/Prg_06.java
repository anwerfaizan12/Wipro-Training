package day_08;

import java.io.*;

public class Prg_06 {

	public static void main(String args[]) throws IOException {

	 String f1="C:\\Users\\Administrator\\Documents\\faizan.txt";

		String ff="C:\\Users\\Administrator\\Documents\\anwer.txt";

		

		try(BufferedInputStream a=new BufferedInputStream(new FileInputStream(f1));

			BufferedOutputStream b=new BufferedOutputStream(new FileOutputStream(ff));){

				

					byte[] buffer=new byte[1024];

			        int bRead;

				while(( bRead=a.read(buffer))!=-1) {

					b.write(buffer,0,bRead);

				}

				System.out.println("Backup is completed");

	}

       catch(IOException e) {

    	   e.printStackTrace();

       }

}
	}

