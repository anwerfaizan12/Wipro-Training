package day_19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextProgram {
	public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   
		   String url = "file:///C:/Users/Administrator/Downloads/Selenium%20WebDriver/HTML%20Pages/AlertBoxDemos.html";
		   //open url
		   driver.get(url);
		   Thread.sleep(3000);	   
		   
           driver.findElement(By.id("prompt")).click();
		   
		   Alert prompt = driver.switchTo().alert();
		   String msg = prompt.getText();
		   System.out.println("The prompt message is : "+msg);
		   prompt.sendKeys("Software Testing");
		   prompt.accept();
		   Thread.sleep(2000);
		   
		   driver.quit();
	   }
}
