package day_21;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Invoc_parameters {

  @Test
  @Parameters({"UserName", "Password"})
  public void sample1(String name, String password) {
    System.out.println("The user name is " + name);
    System.out.println("The password is " + password);
  }

  @Test
  @Parameters({"UserName", "Password"})
  public void samp1(String name, String password) {
    System.out.println("Test with normal method");
    System.out.println("The second test name is " + name);
    System.out.println("The second test password is " + password);
  }
}

