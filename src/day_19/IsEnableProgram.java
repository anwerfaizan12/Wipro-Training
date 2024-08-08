package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableProgram {

public static void main(String[] args) {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   //open url
		   driver.get("https:\\demo.opencart.com");
		   
		  boolean logo =  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).isEnabled();
		   if(logo==true) {
			   System.out.println("Text box is enabled to print");
		   }
		   else {
			   System.out.println("Text box is not enabled to print");
		   }
		   driver.quit();
	   }
}
