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

public class AutomatePaytm {
	public static void main(String[] args) throws InterruptedException, IOException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://paytm.com/");
	
	WebElement clickTrains=driver.findElement(By.xpath("//span[text()='Trains']"));
	clickTrains.click();
	Thread.sleep(5000);
	
	WebElement clickfromField=driver.findElement(By.xpath("//input[@id='sourceInput']"));
	clickfromField.click();
	Thread.sleep(2000);
	
	WebElement clickFromStation=driver.findElement(By.xpath("//div[text()='Howrah Jn']"));
	clickFromStation.click();
	Thread.sleep(2000);
	WebElement clickToField=driver.findElement(By.xpath("//input[@id='destinationInput']"));
	clickToField.click();
	Thread.sleep(2000);
	WebElement clickToStation=driver.findElement(By.xpath("//div[text()='Secunderabad Jn']"));
	clickToStation.click();
	Thread.sleep(2000);
	WebElement clickDepDate=driver.findElement(By.xpath("//div[text()='8']"));
	clickDepDate.click();
	Thread.sleep(2000);
	WebElement clickSearchTrains=driver.findElement(By.xpath("//div[text()='Search Trains']"));
	clickSearchTrains.click();
	Thread.sleep(2000);
	
	 WebElement tt=driver.findElement(By.xpath("//img[@src='https://paytmtravel-images-akamai.paytm.com/icons/Paytm_Travel_Logo.svg']"));
		
		//use getScreenshotAs()
		File src=tt.getScreenshotAs(OutputType.FILE);
		//create a new file
		File dest=new File("./Screenshot/paytm.png");
		//copy
		Files.copy(src,dest);
	
	List<WebElement>trainNamesAndNumbers= driver.findElements(By.xpath("//div[@class='k9j0o']"));
   
   for(WebElement t:trainNamesAndNumbers)
   {
  System.out.println(t.getText());
   }
}

}
