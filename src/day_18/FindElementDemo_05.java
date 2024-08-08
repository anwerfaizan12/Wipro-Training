package day_18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo_05 {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   //open url
		   driver.get("https:\\demo.opencart.com");
		   Thread.sleep(5000);
		   
		   WebElement searchBox = driver.findElement(By.name("seach"));
		   searchBox.sendKeys("Phone");
		   Thread.sleep(3000);
		   
		   driver.findElement(By.className("input-group-btn")).click();
		   Thread.sleep(3000);
		   
		   driver.navigate().back();
		   Thread.sleep(3000);
		   
		   driver.findElement(By.name("searc")).sendKeys("Mac");
		   Thread.sleep(3000);
		   

		   driver.findElement(By.name("search")).sendKeys(Keys.PAGE_DOWN);
		   Thread.sleep(3000);
		   
		   driver.findElement(By.name("search")).sendKeys(Keys.PAGE_UP);
		   Thread.sleep(3000);
		   
		   searchBox = driver.findElement(By.name("search"));
		   searchBox.clear();
		   
		   searchBox.sendKeys(Keys.chord(Keys.SHIFT,"p"));
		   
		   searchBox.sendKeys(Keys.chord("h"));
		   
		   searchBox.sendKeys(Keys.chord("one"));
		   Thread.sleep(3000);
		   
		   searchBox.sendKeys(Keys.BACK_SPACE);
		   
		   searchBox.sendKeys(Keys.BACK_SPACE);
		   
		   searchBox.sendKeys(Keys.BACK_SPACE);
		   
		   Thread.sleep(3000);
		   searchBox.clear();
		   
		   searchBox.sendKeys(Keys.NUMPAD0);
		   
		   searchBox.sendKeys(Keys.NUMPAD1);
		   
		   searchBox.sendKeys(Keys.NUMPAD2);
		   
		   searchBox.sendKeys(Keys.NUMPAD3);
		   
		   Thread.sleep(3000);
		   searchBox.clear();
		   
		   searchBox.sendKeys(Keys.F11);
		   Thread.sleep(3000);

		   searchBox.sendKeys(Keys.F11);
		   Thread.sleep(3000);
		   

		   searchBox.sendKeys(Keys.F5);
		   Thread.sleep(3000);
		   
		   
		   driver.quit();
	   }
}
