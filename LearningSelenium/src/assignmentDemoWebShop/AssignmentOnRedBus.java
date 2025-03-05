package assignmentDemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnRedBus {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	
	WebElement trainTicket=driver.findElement(By.xpath("//span[text()='Train Tickets']"));
	trainTicket.click();
	Thread.sleep(2000);
	
	WebElement fromField=driver.findElement(By.xpath("//div[text()='From']"));
	fromField.click();
	Thread.sleep(2000);
	
	WebElement clickFromStation=driver.findElement(By.xpath("//div[text()='New Delhi']"));
	clickFromStation.click();
	
	WebElement toField=driver.findElement(By.xpath("//div[text()='To']"));
	toField.click();
	
	WebElement clickToStation=driver.findElement(By.xpath("//div[text()='Kalyan Jn']"));
	clickToStation.click();
	
	WebElement clickOnTomorrow=driver.findElement(By.xpath("//button[text()='Tomorrow'] "));
	 clickOnTomorrow.click();
	 
	 WebElement clickOnToggelButton=driver.findElement(By.xpath("//label[@for='switch']"));
	 clickOnToggelButton.click();
	
	 WebElement clickOnSearchButton=driver.findElement(By.xpath("//button[text()='Search Trains']"));
	 clickOnSearchButton.click();
	
}
}
