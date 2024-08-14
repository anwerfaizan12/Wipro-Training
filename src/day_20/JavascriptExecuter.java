package day_20;


import org.openqa.selenium.JavascriptExecutor;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
   		
public class JavascriptExecuter {				

    public static void main(String args[]) throws InterruptedException 					
   {		
		System.getProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
   	 WebDriver driver= new ChromeDriver();			
       		
       //Creating the JavascriptExecutor interface object by Type casting		
       JavascriptExecutor js = (JavascriptExecutor)driver;		
       		
       //Launching the Site.		
       driver.get("http://moneyboats.com/");			
    
       //Maximize window		
       driver.manage().window().maximize();		
       Thread.sleep(3000);
       //Vertical scroll down by 600  pixels		
       js.executeScript("window.scrollBy(0,800)");		
       
       driver.navigate().to("https://demo.guru99.com/V4/");
		
       //Fetching the Domain Name of the site. Tostring() change object to name.		
       String DomainName = js.executeScript("return document.domain;").toString();			
       System.out.println("Domain name of the site = "+DomainName);					
         		
       //Fetching the URL of the site. Tostring() change object to name		
       String url = js.executeScript("return document.URL;").toString();			
       System.out.println("URL of the site = "+url);					
         		
      //Method document.title fetch the Title name of the site. Tostring() change object to name		
      String TitleName = js.executeScript("return document.title;").toString();			
      System.out.println("Title of the page = "+TitleName);					

       		
     //Navigate to new Page i.e to generate access page. (launch new url)		
     js.executeScript("window.location = 'https://demo.opencart.com/'");		
       
       driver.quit();
   }		
}
