package day_19;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookForgotPassword {

public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url="http://www.facebook.com";
		   
		   //open url
		   driver.get(url);
		   
		   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/form/div/div[2]/div/table/tbody/tr[2]/td[2]/input")).sendKeys("anwerfaizan12@gmail.com");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/form/div/div[3]/div/div[1]/button")).click();
		
		   Thread.sleep(1000);
		   
		   driver.quit();
	   }
}
