package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSeleniumWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	     driver.get("https://en-gb.facebook.com/ ");
	     driver.findElement(By.partialLinkText("Create new ")).click();
	     //to wait to reach target element
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.findElement(By.name("firstname")).sendKeys("Deepi");
	     driver.findElement(By.name("lastname")).sendKeys("Pritheev");
	}

}
