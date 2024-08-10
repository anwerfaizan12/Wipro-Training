// getAttribute

package day_19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinksInGooglePage {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url = "https://www.google.com";
		   driver.manage().window().maximize();
		   //open url
		   driver.get(url);
		   Thread.sleep(2000);
		   
           List<WebElement> x = driver.findElements(By.tagName("a"));
           System.out.println("Numer of Links in google page  -  "+x.size());
           
           System.out.println("Links");
           for(WebElement e:x){
        	   System.out.println(e);
           }

		   driver.close();
	   }
}
