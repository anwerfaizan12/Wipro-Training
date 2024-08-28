package day_21;

import org.testng.annotations.Test;



public class Invoc {

  @Test(invocationCount=10)

  public void sample1() {

	  System.out.println("Test with Invocation 10");

  }

  @Test()

  public void samp1() {

	  System.out.println("Test with normal method");

  }

}

