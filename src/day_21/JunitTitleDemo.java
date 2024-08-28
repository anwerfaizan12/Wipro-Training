package day_21;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class JunitTitleDemo {

static WebDriver driver;
@BeforeAll
public static void start()
{
	   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
     driver=new ChromeDriver();
     driver.get("https:\\demo.opencart.com");
     System.out.println("AUT opened");
}

@Test @Order(0)
void test1() {
 System.out.println("From test1");
 assertEquals("Your Store",driver.getTitle());
}

@Test @Order(1)
void test2() throws InterruptedException {
  System.out.println("From test2");
  Thread.sleep(10000);
  Boolean
  a=driver.findElement(By.name("search")).isEnabled();
  assertTrue(a);
}

@AfterAll
public static void end() throws InterruptedException {
Thread.sleep(3000);
driver.close();
System.out.println("AUT closed");
}
}

