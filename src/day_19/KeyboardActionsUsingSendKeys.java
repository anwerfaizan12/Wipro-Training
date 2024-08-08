package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActionsUsingSendKeys {

public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url="http://adactin.com/HotelApp/index.php";

		   //open url
		   driver.get(url);
		   
		   driver.manage().window().maximize();
		   
		   WebElement x = driver.findElement(By.id("username"));
		   x.sendKeys("faizan");
		   
		   WebElement x1 = driver.findElement(By.name("password"));
		   
		   x.sendKeys(Keys.CONTROL,"ac");
		   x1.sendKeys(Keys.CONTROL,"v");
		   
		   
		   
		   driver.quit();
	   }
}
