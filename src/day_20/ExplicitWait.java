package day_20;

import java.time.Duration;
 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
 
public class ExplicitWait
{
 
	public static void main(String[] args) throws InterruptedException 
	{
		System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://en.wikipedia.org/wiki/Main_Page");
         driver.findElement(By.xpath("//*[@id=\"p-search\"]/a/span[1]")).click();
    //     Thread.sleep(5000);
         WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
         wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"searchform\"]/div/div/div[1]/input"))));
         driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/div/div[1]/input")).sendKeys("India");
         driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/button")).click();
         driver.quit();
 
	}
}
