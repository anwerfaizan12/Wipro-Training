// checking correct page is opened or not

package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinCurrentPageProgram {

public static void main(String[] args) {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url = "https://www.adactin.com/HotelApp/index.php";
		   System.out.println(url);
		   //open url
		   driver.get(url);
		   
		   driver.findElement(By.id("username")).sendKeys("faizan");
		   driver.findElement(By.id("password")).sendKeys("12345");
		   String s = driver.getCurrentUrl();
		   System.out.println(s);
		   
		   if(s.equals("https://www.adactin.com/HotelApp/index.php")) {
			   System.out.println("You are in adactin website");
		   }
		   else {
			   System.out.println("You are not in adactin website");
		   }
		   
		   driver.quit();
	   }
}
