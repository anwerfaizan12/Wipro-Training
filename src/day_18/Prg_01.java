package day_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prg_01 {
   public static void main(String[] args) throws InterruptedException {
	   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
	
	   // Launch chrome browser
	   WebDriver driver = new ChromeDriver();
	   
	   //open url
	   driver.get("file:///C:/Users/Administrator/Downloads/Selenium%20WebDriver/HTML%20Pages/WorkingWithForms.html");
	   
	      driver.findElement(By.id("txtUserName")).sendKeys("Faizan");
	        Thread.sleep(1000);

		  driver.findElement(By.id("txtPassword")).sendKeys("sam@123");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.className("Format")).sendKeys("sam@123");
		  Thread.sleep(1000);

		  driver.findElement(By.id("txtFirstName")).sendKeys("Faizan");
		  Thread.sleep(1000);

		  driver.findElement(By.id("txtLastName")).sendKeys("Anwer");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("rbMale")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.name("DtOB")).sendKeys("18/04/1998");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("txtEmail")).sendKeys("anwerfaizan12@gmail.com");
		  Thread.sleep(1000);

		  driver.findElement(By.id("txtAddress")).sendKeys("Mumbai");
		  Thread.sleep(1000);
		  
		  Select city = new Select(driver.findElement(By.name("City")));
		  city.selectByVisibleText("Mumbai");
		  Thread.sleep(1000);
		  

		  driver.findElement(By.id("txtPhone")).sendKeys("1234056789");
		  Thread.sleep(1000);
		  

		  driver.findElement(By.cssSelector("input[value=Reading]")).click();
		  Thread.sleep(1000);
		  

		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(1000);
		  
		  
	   driver.quit();
   }
}
