package day_18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllHyperlinkDemo {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url = "https:\\demo.opencart.com";
		   //open url
		   driver.get(url);

		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   
		   List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		   
		   String[] linkTexts = new String[linkElements.size()];
		   int i=0;
		   System.out.println("Number of hyperlinks "+linkElements.size());
		   
		   for(WebElement e : linkElements) {
			   linkTexts[i] = e.getText();
			   System.out.println("The hyper link text is "+linkTexts[i]);
			   i++;
		   }  
			  
			  
		   driver.quit();
	   }
}
