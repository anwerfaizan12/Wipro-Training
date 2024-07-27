package day_03;

public class Overloading {
  
	public void add(int x,int y) {
		  System.out.println(x+y);
	  }
	
	public void add(float x,float y){
		  System.out.println(x+y);
	  }
  
  
  
  public static void main(String[] args) {
	  Overloading obj = new Overloading();
	  obj.add(3.6f, 5.2f);
	  obj.add(3, 9);
  }
}
