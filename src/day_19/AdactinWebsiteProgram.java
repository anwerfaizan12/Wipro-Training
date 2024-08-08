// enter username ,password and login

package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinWebsiteProgram {

public static void main(String[] args) {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   //open url
		   driver.get("https://www.adactin.com/HotelApp/index.php");
		   
		   driver.findElement(By.id("username")).sendKeys("faizan");
		   driver.findElement(By.id("password")).sendKeys("12345");
		   driver.findElement(By.id("login")).click();
		   
		   System.out.println("Login successfully");
		   driver.quit();
	   }
}
