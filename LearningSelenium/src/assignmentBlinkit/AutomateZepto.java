package assignmentBlinkit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateZepto 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.zeptonow.com/?srsltid=AfmBOorFRkh9BV7HruCczeYXTUfMizsAOVjUifEItm7iBFRfD7rWUKg4"); 
        
	    WebElement clickSearch   = driver.findElement(By.xpath("//span[@class='flex flex-1 items-center gap-x-1 text-md font-extralight text-gray-700']"));
	    clickSearch.click();
	    Thread.sleep(2000);
	    WebElement search   = driver.findElement(By.xpath("//input[@placeholder='Search for over 5000 products']"));
	    search.sendKeys("Noodles");
	    Thread.sleep(2000);
	   WebElement clickElement=driver.findElement(By.xpath("//li[@id='noodles:MANUAL:8ed26cb7-eb7d-4b7b-8d8c-3e93d5855bdd']"));
	    clickElement.click();
	    Thread.sleep(2000);
        
        List<WebElement> allNoodles = driver.findElements(By.xpath("//h5[@class='font-subtitle text-lg tracking-wider line-clamp-2 !text-base !font-semibold !h-9 !tracking-normal px-1.5']"));
       
        for(int i=0;i<allNoodles.size();i++)
        {
        	
        	if(allNoodles.get(i).getText().equals("Korean Samyang Cheese Flavour Hot Chicken Noodles Non Veg"))
        	{
        		allNoodles.get(i).click();
        	}
        }
    
		
		
	}

}
