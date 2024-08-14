package day_20;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
 
public class ImplicitWait
{
 
	public static void main(String[] args) 
	{
		System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   String baseUrl = "http://www.wikipedia.org/";
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.get(baseUrl + "/wiki/Main_Page");
         driver.findElement(By.id("searchInput")).clear();
         driver.findElement(By.id("searchInput")).sendKeys("India");
         driver.findElement(By.id("searchButton")).click();
         driver.quit();
 
	}
}