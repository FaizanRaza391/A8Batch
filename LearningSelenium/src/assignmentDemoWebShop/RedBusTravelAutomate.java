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
		
		//driver.findElement(By.xpath("//text[@class='dateText']")).click();
		
	 /*	WebElement scrollTill = driver.findElement(By.xpath("//text[@class='dateText']"));
		
		Thread.sleep(2000);
		// perform explicit typecasting
		JavascriptExecutor j = (JavascriptExecutor) driver;
	
		j.executeScript("arguments[0].scrollIntoView(true)",scrollTill);

		driver.findElement(By.xpath("//span[text()='16']")).click();*/
		

	}

}
