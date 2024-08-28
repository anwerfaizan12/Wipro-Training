package day_08;

import java.io.*;

class Employee implements java.io.Serializable{

	   public String name;

	   public int ID;

	   public String designation;

	   public transient int salary;

}

public class Prg_02 {

	public static void main(String args[]) {

		Employee e=new Employee();

		e.name="Faizan Anwer";

		e.ID=1271;

		e.designation="Software Developer";

		e.salary=40000;

		

		try {

			File f=new File("C:\\Users\\Administrator\\Documents\\employee_data.txt");

			FileOutputStream fileOut=new FileOutputStream(f);

			ObjectOutputStream out=new ObjectOutputStream(fileOut);

			out.writeObject(e);

			out.close();

			fileOut.close();

			System.out.println("Serialized data is saved");}

		catch(IOException i) {

			i.printStackTrace();

			}

		Employee e1=null;

		try {

			FileInputStream fileIn =new FileInputStream("C:\\Users\\Administrator\\Documents\\employee_data.txt");

			ObjectInputStream in=new ObjectInputStream(fileIn);

			e1=(Employee)in.readObject();

			System.out.println("Name:"+e1.name);

			System.out.println("ID: "+e1.ID);

			System.out.println("Designation:"+e1.designation);

			System.out.println("Salary: "+e1.salary);

			in.close();

			fileIn.close();

		}catch(IOException i) {

			i.printStackTrace();

			return;

		}

		catch(ClassNotFoundException c) {

			System.out.println("Employee data not found");

			c.printStackTrace();

			return;

		}

	}
	}

   

   



