package day_21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class JunitTitle {
WebDriver driver;
@BeforeEach
public void start()
{
	   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
     driver=new ChromeDriver();
     driver.get("https:\\demo.opencart.com");
     System.out.println("AUT opened");
}

@Test
public void test1() {
 System.out.println("From test1");
 assertEquals("Your Store",driver.getTitle());
}

@Test
public void test2() throws InterruptedException {
  System.out.println("From test2");
  Thread.sleep(10000);
  Boolean
  a=driver.findElement(By.name("search")).isEnabled();
  Assert.assertFalse(a);
}

@AfterEach
public void end() throws InterruptedException {
Thread.sleep(3000);
driver.close();
System.out.println("AUT closed");
}

}

