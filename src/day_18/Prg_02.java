package day_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg_02 {
   public static void main(String[] args) throws InterruptedException {
	   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
	
	   // Launch chrome browser
	   WebDriver driver = new ChromeDriver();
	   
	   String url = "https:\\demo.opencart.com";
	   //open url
	   driver.get(url);
	   
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	   
	   
	   
	   driver.quit();
   }
}
