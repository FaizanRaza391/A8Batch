package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomatePaytmWithWindowHandlingOperations extends BaseClass {

	public static void main(String[] args) {
		setUp("chrome", 20, "https://www.paytm.com");
		WebElement ticketBooking = driver.findElement(By.xpath("//li[text()='Ticket Booking']"));
		Actions a = new Actions(driver);
		a.moveToElement(ticketBooking).perform();
		driver.findElement(By.linkText("Movie Tickets")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		
		for(String id:allId)
		{
		driver.switchTo().window(id);
		if(driver.getTitle().equals("Movies - Online Movie Ticket Booking & Get Cashback/Offers at Paytm"))
		{
			break;
		}
		}
	
	

		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Noida");
		driver.findElement(By.xpath("//div[text()='Greater Noida']")).click();
		
		driver.findElement(By.xpath("//div[@class='PageBlockWidget_closeBtn__MdHIU']")).click();
		
        Set<String> allIds = driver.getWindowHandles();
		
		for(String id:allIds)
		{
		driver.switchTo().window(id);
		if(driver.getTitle().equals("District by Zomato - Movies, Events, Dining, Sports, Concerts"))
		{
			break;
		}
		}
	
		
		driver.findElement(By.xpath("//button[@class='css-km8wg8']")).click();
		driver.findElement(By.xpath("//a[@class='user-icon css-1gfw5u']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys("6395243444");
		
		driver.switchTo().window(parentId);

	}

}
