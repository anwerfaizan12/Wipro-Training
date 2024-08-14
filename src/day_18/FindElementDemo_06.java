package day_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo_06
{

	public static void main(String[] args) throws InterruptedException
	{
	
	    System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.opencart.com/");
		
		Thread.sleep(10000);

		//Featured xpath
		String text=driver.findElement(By.xpath("//*[@id='content']/h3")).getText();
		
		System.out.println("Text : "+text);
		
		System.out.println("\n**************\n\nDiv text:");
		
		//1st Featured div
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/div")).getText());
		
		driver.quit();

	}
}