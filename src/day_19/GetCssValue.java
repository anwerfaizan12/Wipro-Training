// getAttribute

package day_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	   public static void main(String[] args) throws InterruptedException {
		   System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		   // Launch chrome browser
		   WebDriver driver = new ChromeDriver();
		   
		   String url = "https://adactin.com/HotelApp/index.php";
		   driver.manage().window().maximize();
		   //open url
		   driver.get(url);
		   Thread.sleep(2000);
		   
		   WebElement x = driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a"));
		   
		   String x1 = x.getCssValue("font-size");
		   System.out.println("font-size  "+x1);

		   String x2 = x.getCssValue("color");
		   System.out.println("color  "+x2);

		   String x3 = x.getCssValue("font-weight");
		   System.out.println("font-weight  "+x3);
		   

		   String x4 = x.getCssValue("font-family");
		   System.out.println("font-family  "+x4);
		   

		   String x5 = x.getCssValue("background");
		   System.out.println("background  "+x5);

		   driver.close();
	   }
}
