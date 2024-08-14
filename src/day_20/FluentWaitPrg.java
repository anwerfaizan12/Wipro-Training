package day_20;



import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FluentWaitPrg
{

	public static void main(String[] args) throws InterruptedException 
	{

		 //Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
			
		   driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
        //fluent wait
        Wait wait1 = new FluentWait(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"searchform\"]/div/div/div[1]/input"))));
        wait1.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"searchform\"]/div/div/div[1]/input"))));

        driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/div/div[1]/input")).sendKeys("India");
        driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/button")).click();
        driver.quit();

	}
}
