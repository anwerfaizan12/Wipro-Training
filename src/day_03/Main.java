package day_03;

 class Animal {
 public void sound() {
	 System.out.println("bhon.. bhon..");
 }
 }
 
 class Cat extends Animal{
	 public void sound() {
		 System.out.println("miyon... miyon...");
	 }
 }
 
 class Bird extends Animal{
	 public void sound() {
		 System.out.println("cheen... cheen...");
	 }
 }
 
  public class Main{
	 public static void main(String[] args) {
		 
		 Cat c = new Cat();
		 c.sound();
		 
		 Bird b = new Bird();
		 b.sound();
	 }
 
}
