package day_28;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg1 {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url ="http://the-internet.herokuapp.com";
		   driver.manage().window().maximize();
		   //open url
		   driver.get(url);
		   Thread.sleep(2000);

		   driver.navigate().to("https://the-internet.herokuapp.com/login");
		   Thread.sleep(2000);
		   
		   WebElement e1 = driver.findElement(By.name("username"));
		   e1.sendKeys("tomsmith");
		   Thread.sleep(1000);
		   

		   WebElement e2 = driver.findElement(By.name("password"));
		   e2.sendKeys("SuperSecretPassword!");
		   Thread.sleep(2000);
		   

		   WebElement e3 = driver.findElement(By.className("radius"));
		   e3.click();
		   

		   WebElement e4 = driver.findElement(By.xpath(" //*[@id=\"content\"]/div/a"));
		   e4.click();
		   Thread.sleep(1000);
		   
		   Thread.sleep(1000);

		   driver.close();
	   }
}
