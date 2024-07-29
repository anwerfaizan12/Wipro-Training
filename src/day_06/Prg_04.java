package day_06;

class Employee4 {
     int id = 112233;
     String name = "faizan";
     String department = "Testing";
    
    public void display() {
        System.out.println("name -> " + name + "  id -> " + id + "  department -> " + department);
    }
}

// default can be accessed from the other class of same package

public class Prg_04 {
    public static void main(String[] args) {
        Employee4 e = new Employee4();
        System.out.println("name -> " + e.name);
        System.out.println("id -> " + e.id);
        System.out.println("department -> " + e.department);
        
        e.display();
    }
}
