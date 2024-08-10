// getAttribute

package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url ="file:///C:/Users/Administrator/Downloads/Selenium%20WebDriver/HTML%20Pages/WorkingWithForms.html";
		   driver.manage().window().maximize();
		   //open url
		   driver.get(url);
		   Thread.sleep(2000);

		   driver.findElement(By.id("rbMale")).click();
		   Thread.sleep(2000);

		   driver.close();
	   }
}
