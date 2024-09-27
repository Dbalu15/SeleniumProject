	package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrCinema {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		Thread.sleep(2000);
		WebElement dd =driver.findElement(By.xpath("//div[@class='date-show']/span[2]"));
		dd.click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='03:40 PM']")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sc-kLhKbu leNRZS reject-terms']")).click();
		driver.findElement(By.xpath("//span[@id='EX.EXECUTIVE|J:8']")).click();
		driver.findElement(By.xpath("//button[@class='sc-geXuza jdgnEx btn-proceeded']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary confirm-btn-pvr border-0 ']")).click();
		String pvr=driver.getTitle();
		System.out.println(pvr);
		driver.close();
		
		
	}

}
