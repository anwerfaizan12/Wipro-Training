// name : faizan anwer
// date : 15/07/2024
// description : calculate area and perimeter of circle

package day_01;

import java.util.Scanner;

public class Prg3 {
	 public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter radius of the circle");
			double r = scn.nextDouble();
			
			double area = Math.PI * r * r;
			double perimeter = 2 * Math.PI * r;
			
			System.out.println("Area - "+area);
			System.out.println("Perimeter - "+perimeter);
	 }
}
