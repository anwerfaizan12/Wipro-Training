package day_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGTitleDemo {
WebDriver driver;
@Test(priority=2)
  public void test1() {
 System.out.println("From test1");
 Assert.assertEquals("Your Store", driver.getTitle());
  }
  @Test(priority=1)
  public void test2() throws InterruptedException {
 System.out.println("From test2");
 Thread.sleep(10000);
 Boolean
 a=driver.findElement(By.name("search")).isEnabled();
 Assert.assertTrue(a);
  }

  @AfterMethod
  public void end() throws InterruptedException {
 Thread.sleep(3000);
 driver.close();
 System.out.println("AUT closed");
  }

  @BeforeMethod
  public void beforeTest() {
	   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
      driver=new ChromeDriver();
      driver.get("https:\\demo.opencart.com");
      System.out.println("AUT opened");
  }

}
