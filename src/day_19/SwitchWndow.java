package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow
{

	public static void main(String[] args) throws InterruptedException
	{

		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
			
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url = "file:///C:/Users/Administrator/Downloads/Selenium%20WebDriver/HTML%20Pages/PopupWin.html";
		   driver.get(url);
		
		String parentWindow = driver.getWindowHandle().toString();
		Thread.sleep(5000);
		
		driver.findElement(By.name("Open")).click();
		Thread.sleep(5000);
		
		driver.switchTo().window("PopupWindow");
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);
		driver.close();

	}

}

