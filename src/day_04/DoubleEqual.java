package day_04;

public class DoubleEqual {
  
  public static void main(String[] args) {
	  
	  String s1 = "faizan";
	  String s2 = "anwer";
	  String s3 = new String("faizan");
	  
	  boolean result = s1==s2;
	  System.out.println(result);
	  
	  System.out.println(s1==s3);
  }
}
