package day_19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckGmailTitle {

public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url="http://www.google.co.in/";
		   
		   //open url
		   driver.get(url);
		   
		   driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
		   String title = driver.getTitle();
		   if(title.equals("Gmail")) {
			   System.out.println("Gmail ACC");
		   }
		   else {
			   System.out.println("Invalid");
		   }
		   
		   driver.quit();
	   }
}
