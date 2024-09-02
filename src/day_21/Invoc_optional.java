package day_21;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Invoc_optional {
 
  @Test
  @Parameters({"UserName", "Password"})
  public void sample1(String name, String password) {
    System.out.println("The user name is " + name);
    System.out.println("The password is " + password);
  }
 
  @Test
  @Parameters({"UserName", "Password"})
  public void samp1(@Optional("Faizan") String name, @Optional("12345") String password) {
    System.out.println("Test with optional parameters");
    System.out.println("The second test name is " + name);
    System.out.println("The second test password is " + password);
  }
}

