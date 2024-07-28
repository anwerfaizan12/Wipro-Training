package day_05;

abstract class Shape1 {
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}

class Circle1 extends Shape1 {
    private int r = 5;

    public void calculateArea() {
        System.out.println("Area of the circle is -> " + Math.PI * r * r);
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter of the circle is -> " + Math.PI * 2 * r);
        System.out.println();
    }
}

class Triangle1 extends Shape1 {
    private int b = 5;
    private int h = 4;
    private int s1 = 6;
    private int s2 = 8;
    private int s3 = 10;

    public void calculateArea() {
        System.out.println("Area of the triangle is -> " + (0.5 * b * h));
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter of the triangle is -> " + (s1 + s2 + s3));
    }

}

public class Prg1 {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.calculateArea();
        c.calculatePerimeter();

        Triangle1 t = new Triangle1();
        t.calculateArea();
        t.calculatePerimeter();
    }
}
