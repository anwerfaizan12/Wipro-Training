package day_19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWinDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
			
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		String url = "file:///C:/Users/Administrator/Downloads/Selenium%20WebDriver/HTML%20Pages/PopUpWinDemo.html";
		driver.get(url);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("newtab")).click();
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent Window: "+parentWindow);
		
		for (String childWindow : driver.getWindowHandles())
		{
		  if(!childWindow.equals(parentWindow))
		 {
						driver.switchTo().window(childWindow);
						driver.findElement(By.id("alert")).click();
						Alert alert=driver.switchTo().alert();
						alert.accept();
						System.out.println("Child Window: "+childWindow);
		}
		}
		
		for (String childWindow : driver.getWindowHandles())
		{
			if(!childWindow.equals(parentWindow))
			{
				driver.switchTo().window(childWindow);
				break;
			}
		}
		
		Thread.sleep(5000);

		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.close();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}