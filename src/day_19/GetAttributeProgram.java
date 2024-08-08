// getAttribute

package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeProgram {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url = "https:\\demo.opencart.com";
		   //open url
		   driver.get(url);
		   Thread.sleep(2000);
		   
		    driver.findElement(By.name("search")).sendKeys("laptop");
		    String s =  driver.findElement(By.name("search")).getAttribute("value");
		    System.out.println(s);
		    Thread.sleep(2000);
		   
		   driver.quit();
	   }
}
