package day_21;

import org.testng.annotations.Test;



public class Invoc_enable {

  @Test(invocationCount=10,enabled=false)

  public void sample1() {

	  System.out.println("Test with invocation 10");

  }

  @Test()

  public void samp1() {

	  System.out.println("Test with normal method");

  }

}



