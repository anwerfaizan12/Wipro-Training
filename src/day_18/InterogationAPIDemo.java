package day_18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterogationAPIDemo {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   
		   String url = "https:\\demo.opencart.com";
		   //open url
		   driver.get(url);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   
		   String pageTitle = driver.getTitle();
		   System.out.println("Page title is "+pageTitle);
		   System.out.println("Current Url : "+driver.getCurrentUrl());
		   
		   String pageDOM = driver.getPageSource();
		   System.out.println("*************Page Source**************");
		   System.out.println(pageDOM);
		   System.out.println("**************************************");
		   if(pageTitle.equals("Your Store")) {
			   System.out.println("Expected title is present");
		   }
		   else {
			   System.out.println("Expected title is not present");
		   }
		   
		   if(url.equals(driver.getCurrentUrl())) {
			   System.out.println("URL same");
		   }
		   else {
			   System.out.println("URL not same");
		   }
		   
		   System.out.println("Page contains 'Featured' :"+pageDOM.contains("Featured"));
		   
		   driver.quit();
	   }
}
