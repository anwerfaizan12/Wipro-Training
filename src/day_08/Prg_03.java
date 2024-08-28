package day_08;

import java.io.*;


public class Prg_03 {

	public static void main(String args[]) throws IOException{

		File f=new File("C:\\Users\\Administrator\\Documents\\faizu.txt");

		File f1=new File("C:\\Users\\Administrator\\Documents\\khan.txt");

		

		FileInputStream in=null;

		FileOutputStream out=null;

		try {

			in=new FileInputStream(f);

			out=new FileOutputStream(f1);

			int c;

			while((c=in.read())!= -1) {

				System.out.print((char)c);

				out.write(c);

			}

		}

		catch(Exception e) {

			System.out.println("File handling error: "+e);

		}finally {

			if(in!=null) {

				in.close();

			}

			if(out!=null) {

				out.close();

			}

		}

		System.out.println(f1.exists());

		System.out.println(f1.getName());

		System.out.println(f1.renameTo(f));

		System.out.println(f1.delete());

		}
	}






