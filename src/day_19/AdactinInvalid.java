// enter username ,password and login

package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinInvalid {

public static void main(String[] args) {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   //open url
driver.get("https://www.adactin.com/HotelApp/index.php");
		   
		   driver.findElement(By.id("username")).sendKeys("faizan");
		   driver.findElement(By.id("password")).sendKeys("12345");
		   driver.findElement(By.id("login")).click();
		   
		   boolean res = driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[5]/td[2]/div/b")).isDisplayed();
		   
		   if(res == true) {
			   System.out.println("Invalid message shown");
		   }
		   else {
			   System.out.println("not");
		   }
		   
		   driver.quit();
	   }
}
