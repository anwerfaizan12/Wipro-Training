package day_20;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenShot {
	static WebDriver driver;
   public static void main(String[] args) {
       // Set the path to your ChromeDriver executable
		System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");

       // Initialize ChromeDriver
       driver = new ChromeDriver();
       try {
           // Navigate to the Google homepage
           driver.get("https://www.google.com");

           // Perform a search
           WebElement searchBox = driver.findElement(By.name("q"));
           searchBox.sendKeys("Selenium WebDriver");
           searchBox.submit();
           String e="Google Search";
          //String e="Selenium WebDriver - Google Search";
           String a=driver.getTitle();
           // Failing assertion (change the expected title to trigger a failure)
           if (!a.equals(e)) {
           	System.out.println("Title verification failed");
           	System.out.println("Expected title: "+e);
           	System.out.println("Actual title: "+a);
               captureScreenshot("screenshot");
           }
           else
           {
           	System.out.println("Title verification passed");
           	System.out.println("Expected title: "+e);
           	System.out.println("Actual title: "+a);
               
           }

           // Rest of your test logic...
       } catch (Exception e) {
       	System.out.println(e);
       }
       driver.quit();
   }

   private static void captureScreenshot(String testName) {
       try {
           TakesScreenshot ts = (TakesScreenshot)driver;
           File srcFile = ts.getScreenshotAs(OutputType.FILE);
           Path targetPath = Path.of("C:\\Users\\Administrator\\Documents\\" + testName + ".png");
           Files.copy(srcFile.toPath(), targetPath);
           System.out.println("Screenshot saved: " + targetPath.toAbsolutePath());
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   
}
