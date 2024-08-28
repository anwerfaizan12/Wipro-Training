package day_08;

import java.util.*;

import java.io.*;

class Student{
private String name;
private int age;
private char grade;
public Student(String name, int age, char grade) {
this.name=name;
this.age=age;
this.grade=grade;

}

public String getName() {
return this.name;
}
public void setName(String name) {
this.name=name;
}
public int getAge() {
return this.age;
}
public void setAge(int age) {
this.age=age;
}
public char getGrade() {
return this.grade;
}
public void setGrade(char grade) {
this.grade=grade;
}
public String toString(){
return ("name: "+name+" age: "+age+" grade: "+grade);
}
}

public class Prg_05 {
         public static void main(String args[]) {
        List<Student>stud=new ArrayList<>();
        stud.add(new Student("Sameera",22,'A'));
        stud.add(new Student("Mariya",23,'A'));
        stud.add(new Student("Iqra",22,'B'));
     
     
        File f=new File("C:\\Users\\Administrator\\Documents\\StudentData.txt");
      try{
     FileOutputStream fo=new FileOutputStream(f);
     DataOutputStream dos=new DataOutputStream(fo);
       
        for(Student s:stud) {
        dos.writeUTF(s.getName());
        dos.writeInt(s.getAge());
        dos.writeChar(s.getGrade());

        }
      System.out.println("Student data has been written to "+f);}
      catch(IOException i) {
      i.printStackTrace();
      }
     List<Student>studentsFromFile=new ArrayList<>();
     
     try{
    FileInputStream fi=new FileInputStream(f);
    DataInputStream dis=new DataInputStream(fi);
     
      while(dis.available()>0) {
      String name=dis.readUTF();
      int age=dis.readInt();
      char grade=dis.readChar();
      studentsFromFile.add(new Student(name,age,grade));}
      System.out.println("Grade:");
   
      System.out.println("\nStudents read from file:");
      for(Student s:studentsFromFile) {
      System.out.println(s);}}
      catch(IOException e) {
      e.printStackTrace();
     
      }
       
         }
         }


 


