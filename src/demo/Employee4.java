package demo;

public class Employee4 {
	     protected int id = 112233;
	     protected String name = "faizan";
	     protected String department = "Testing";
	    
	    public void display() {
	        System.out.println("name -> " + name + "  id -> " + id + "  department -> " + department);
	    }
	    
	    public static void main(String[] args) {
	    	Employee4 e = new Employee4();
	    	e.display();
	    }
	}

