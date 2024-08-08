// enter username ,password and login

package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinWbsitePrintProgram {

public static void main(String[] args) {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   //open url
		   driver.get("https://www.adactin.com/HotelApp/index.php");
		   
		   driver.findElement(By.id("username")).sendKeys("faizan");
		   driver.findElement(By.id("password")).sendKeys("faizan");
		   
		   String name =  driver.findElement(By.id("username")).getAttribute("value");
		   String password =  driver.findElement(By.id("password")).getAttribute("value");
		   
		   System.out.println("username : "+name);
		   System.out.println("password : "+password);
		   
		   driver.quit();
	   }
}
