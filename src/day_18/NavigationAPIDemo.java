package day_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigationAPIDemo {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url = "https:\\demo.opencart.com";
		   //open url
		   driver.get(url);

		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   
           driver.navigate().to("http://demo.opencart.com/index.php?route=product/category&path=57"); 
		   Thread.sleep(5000);
		   
		   driver.navigate().refresh();
		   Thread.sleep(5000);
		   
		   driver.navigate().back();
		   Thread.sleep(5000);

		   driver.navigate().forward();
		   Thread.sleep(5000);
		     
		   driver.quit();
	   }
}
