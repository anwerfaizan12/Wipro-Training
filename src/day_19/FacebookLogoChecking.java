package day_19;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogoChecking {

public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url="http://www.facebook.com";
		   
		   //open url
		   driver.get(url);
		   
          boolean logo =  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
          if(logo == true) {
        	  System.out.println("Facebook logo is available");
          }
          else {
        	  System.out.println("Facebook logo is not available");
          }
		   
		   driver.quit();
	   }
}
