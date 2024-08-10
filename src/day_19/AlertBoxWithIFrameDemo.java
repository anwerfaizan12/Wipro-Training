package day_19;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class AlertBoxWithIFrameDemo
{

	public static void main(String[] args) throws InterruptedException
	{
	
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
			
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url = "file:///C:/Users/Administrator/Downloads/Selenium%20WebDriver/HTML%20Pages/AlertBoxWithIFrameDemo.html";
		   driver.get(url);
		   
		   Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(5000);
		
		Alert confirm=driver.switchTo().alert();
		
		confirm.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(5000);
		
		confirm=driver.switchTo().alert();
		
		confirm.dismiss();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("prompt")).click();
		
		Thread.sleep(5000);
		
		Alert prompt=driver.switchTo().alert();
		
		String text=prompt.getText();
		System.out.println(text);
		
		prompt.sendKeys("Faizan Anwer");
		
		Thread.sleep(5000);
		
		prompt.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("prompt")).click();
		
		Thread.sleep(5000);
		
		prompt=driver.switchTo().alert();
		
		prompt.dismiss();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
