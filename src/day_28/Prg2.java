package day_28;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg2 {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url ="http://the-internet.herokuapp.com";
		   driver.manage().window().maximize();
		   //open url
		   driver.get(url);
		   Thread.sleep(2000);

		   driver.navigate().to("https://the-internet.herokuapp.com/download");
		   Thread.sleep(2000);

		   WebElement e = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[8]"));
		   e.click();
		   
		   Thread.sleep(1000);

		   driver.close();
	   }
}
