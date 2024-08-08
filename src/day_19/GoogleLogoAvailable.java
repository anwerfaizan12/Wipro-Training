package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLogoAvailable {

public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url="http://www.google.co.in/";
		   
		   //open url
		   driver.get(url);
		   
          boolean logo =  driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
          if(logo == true) {
        	  System.out.println("Google logo is available");
          }
          else {
        	  System.out.println("Google logo is not available");
          }
		   
		   driver.quit();
	   }
}
