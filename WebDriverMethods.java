package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://en-gb.facebook.com/ ");
	     //to get title of the page
	     //ctrl+2 and L --> it will store in string
	     String title = driver.getTitle();
	     System.out.println("Title of the page is"+ title);
	     if(title.contains("Facebook"))
	     {
	    	 System.out.println("Title is verified");
	     }
	     else
	     {
	    	 System.out.println("Title is not verified");
	     }
	     
	     //to get current URL
	     String currentUrl = driver.getCurrentUrl();
	     System.out.println(currentUrl);
	     
	     //driver.findElement(By.id("Value")).getText();--> to get text from application
	     
	     driver.close();
	}

}
