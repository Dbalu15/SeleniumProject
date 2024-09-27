package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    WebElement ser = driver.findElement(By.id("twotabsearchtextbox"));
    ser.sendKeys("Bags of boys");
    driver.findElement(By.id("nav-search-submit-button")).click();
    String tt = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
    System.out.println(tt);
    WebElement b1 = driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::i"));
    b1.click();
    WebElement b2 = driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[2]"));
    b2.click();
    driver.findElement(By.xpath("//span[@class='a-button-inner']")).click();
    driver.findElement(By.linkText("Newest Arrivals")).click();
    WebElement t2= driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]"));
    String bn =t2.getText();
    System.out.println("Bag Name:" +bn);
    WebElement t3=driver.findElement(By.xpath("//span[text()='2,100']"));
    String pr = t3.getText();
    System.out.println("Discounted price is" + pr	);
    String t1= driver.getTitle();
     System.out.println("Title page is" +t1);
     driver.close();
	}

}
