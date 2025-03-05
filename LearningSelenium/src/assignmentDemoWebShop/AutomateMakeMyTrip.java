package assignmentDemoWebShop;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AutomateMakeMyTrip {
	public static void main(String[] args) throws InterruptedException, IOException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	
	WebElement closePopup=driver.findElement(By.xpath("//span[@class='commonModal__close']"));
	closePopup.click();
	Thread.sleep(2000);
	WebElement clickTrains=driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains inactive']"));
	clickTrains.click();
	Thread.sleep(2000);
	WebElement clickfromField=driver.findElement(By.xpath("//span[text()='From']"));
	clickfromField.click();
	Thread.sleep(2000);
	WebElement clickFromStation=driver.findElement(By.xpath("//span[text()='Chennai']"));
	clickFromStation.click();
	Thread.sleep(2000);
	WebElement clickToField=driver.findElement(By.xpath("//span[text()='To']"));
	clickToField.click();
	Thread.sleep(2000);
	WebElement clickToStation=driver.findElement(By.xpath("//span[text()='Kolkata']"));
	clickToStation.click();
	Thread.sleep(2000);
	
	WebElement clickDepDate=driver.findElement(By.xpath("//label[@for='travelDate']"));
	clickDepDate.click();
	Thread.sleep(2000);
	WebElement clickDate=driver.findElement(By.xpath("//div[@aria-label='Thu Mar 06 2025']"));
	clickDate.click();
	Thread.sleep(2000);
	
	
	
	WebElement clickSelectClass=driver.findElement(By.xpath("//div[@data-cy='RailSearchWidget_341']"));
	clickSelectClass.click();
	Thread.sleep(2000);
	
	WebElement clickClass=driver.findElement(By.xpath("//li[text()='First AC']"));
	clickClass.click();
	Thread.sleep(2000);
	
	WebElement search=driver.findElement(By.xpath("//a[text()='Search']"));
	search.click();
	
	Thread.sleep(2000);
	List<WebElement> trainNamesAndNumbers= driver.findElements(By.xpath("//div[@class='ListingCard_listItem__9YPIT']"));
   int count=0;
   for(WebElement t:trainNamesAndNumbers)
   {
  System.out.println(t.getText());
  System.out.println("=================");
 count++;
   }
   System.out.println("Total Trains:"+count);
}

}
