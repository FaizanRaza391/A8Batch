package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomateSwiggyInstamart extends BaseClass {

	public static void main(String[] args) throws InterruptedException  {
 
		setUp("chrome",20,"https://www.swiggy.com/");
		
		driver.findElement(By.xpath("//div[@class='Uccaw']/a[text()='Swiggy Corporate']")).click();
		
        Set<String> allId = driver.getWindowHandles();
		
		for(String id:allId)
		{
		driver.switchTo().window(id);
		if(driver.getTitle().equals("Swiggy"))
		{
			break;
		}
		}
	    Thread.sleep(2000);
	 	WebElement investorRelations = driver.findElement(By.xpath("//a[@id='sm-1741877705878495-1']"));
		Actions a = new Actions(driver);
		a.moveToElement(investorRelations).perform();
		//driver.findElement(By.xpath("")).click();

	/*	JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 2; i++) {
			j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);*/
		}

	}


