package day_02;

public class doWhile {
  public static void main(String[] args) {
	  int sum=0;
	  int i=1;
	  do {
		  sum+=i*10;
		  i++;
	  }while(i<=10);
	  System.out.println("Sum is -> "+sum);
  }
  
}
