package day_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg_02 {
   public static void main(String[] args) throws InterruptedException {
	   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
	
	   // Launch chrome browser
	   WebDriver driver = new ChromeDriver();
	   
	   //open url
	   driver.get("https:\\demo.opencart.com");
	   
	   // assigning expected result
	   String expectedTitle = "Your Store";
	   
	   // fetch title
	   String actualTitle = driver.getTitle();
	   
	   // comparing expected and actual result
	   
	   if(expectedTitle.contentEquals(actualTitle)) 
	   {
		   System.out.println("Title verification point passed");
		   System.out.println("Expected Title - "+expectedTitle);
		   System.out.println("Axtual Title - "+actualTitle);
	   }
	   else
	   {
		   System.out.println("Title verification point failed");
		   System.out.println("Expected Title - "+expectedTitle);
		   System.out.println("Axtual Title - "+actualTitle);
	   }
	   
	   // find and type in search text box
	   driver.findElement(By.name("search")).sendKeys("laptop");
	   
	   Thread.sleep(3000);
	   
	   // find and click search button
	   driver.findElement(By.xpath("//*[@id=\"carousel-banner-0\"]/div[2]/div[1]/div/div/a/img")).click();
	   
	   driver.quit();
   }
}
