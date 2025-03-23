package assignmentDemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class RedBusTravelAutomate extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		 setUp("chrome",20,"https://www.redbus.in/");
		 
		 
		 driver.findElement(By.xpath("//span[text()='Bus Tickets']")).click();
		
		driver.findElement(By.xpath("//input[@class='sc-bxivhb dsDRlf']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//text[text()='Delhi']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Agra");
		driver.findElement(By.xpath("//text[text()='Agra']")).click();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 1; i++) {
			j.executeScript("window.scrollBy(0,100)");
			Thread.sleep(2000);
		}

		
		driver.findElement(By.xpath("//text[@class='dateText']")).click();
		Thread.sleep(2000);
	 	driver.findElement(By.xpath("//span[text()='13']")).click();
		
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();

	}

}
