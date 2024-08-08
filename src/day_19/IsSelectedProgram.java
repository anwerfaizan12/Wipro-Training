package day_19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedProgram {

public static void main(String[] args) {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url="file:///C:/Users/Administrator/Downloads/Selenium%20WebDriver/HTML%20Pages/WorkingWithForms.html";
		   //open url
		   driver.get(url);
		   
		   List<WebElement> radioElem = driver.findElements(By.name("gender"));
			  for(WebElement webElement : radioElem) {
				  String radioSelection = webElement.getAttribute("value").toString();
				  if(radioSelection.equals("Male")) {
					  webElement.click();
				  }
				  try {
					  Thread.sleep(500);
				  }
				  catch(InterruptedException ex) {
					  System.out.println(ex.getMessage());
				  }
			  }
		   
		  boolean logo =  driver.findElement(By.id("rbMale")).isSelected();
		   if(logo==true) {
			   System.out.println("button is selected");
		   }
		   else {
			   System.out.println("button is not selected");
		   }
		   driver.quit();
	   }
}
