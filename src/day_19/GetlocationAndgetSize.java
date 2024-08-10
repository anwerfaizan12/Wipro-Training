// getAttribute

package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetlocationAndgetSize {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url = "https://demo.actitime.com/login.do";
		   //open url
		   driver.get(url);
		   Thread.sleep(2000);
		   
		   WebElement un = driver.findElement(By.id("FirstName"));
		   
		    // To get the size of the element :height and width
		   Dimension s = un.getSize();
		   int h = s.getHeight();
		   int w = s.getWidth();

		   System.out.println("Height "+h);
		   System.out.println("Width "+w);
		   
//		   To get location of an element;x-axis and y-axis
		   
		   Point l = un.getLocation();
		   int x = l.getX();
		   int y = l.getY();
		   
		   System.out.println("x-axis "+x);
		   System.out.println("y-axis"+y);
		   
		   Thread.sleep(2000);
		   
		   driver.quit();
	   }
}
