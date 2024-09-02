package day_28;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg3 {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url ="http://the-internet.herokuapp.com";
		   driver.manage().window().maximize();
		   //open url
		   driver.get(url);
		   Thread.sleep(2000);

		   driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading");
		   Thread.sleep(1000);
		   
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   WebElement e = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]"));
		   e.click();
		   
		   Thread.sleep(1000);

		   driver.close();
	   }
}
