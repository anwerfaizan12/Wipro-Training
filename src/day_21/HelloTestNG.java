package day_21;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class HelloTestNG {
  @Test
  public void test1() {
 System.out.println("From test1");
  }
 
  @Test
  public void test2() {
 System.out.println("From test2");
  }
  @BeforeClass
  public void beforeClass() {
 System.out.println("before class");
  }

  @AfterClass
  public void afteClass() {
 System.out.println("after class");
  }

  @BeforeMethod
  public void beforeTest() {
 System.out.println("before test");
  }

  @AfterMethod
  public void afterTest() {
 System.out.println("from after test");
  }

}


