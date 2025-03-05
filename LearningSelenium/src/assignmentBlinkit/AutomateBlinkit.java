package assignmentBlinkit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateBlinkit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://blinkit.com/cn/milk/cid/14/922?utm_source=google&utm_medium=cpc&utm_campaign=21439030315&utm_content=169426454132&utm_term=blinkit&gad_source=1&gclid=Cj0KCQiA8fW9BhC8ARIsACwHqYphlJGMPNxrrAVRExYbN8V7EJZHdfWHyWSU6MIGK1OB4BFUL7Sy2dIaAsRKEALw_wcB"); 
        
	WebElement clickSearch   = driver.findElement(By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']"));
	    clickSearch.click();
	    WebElement search   = driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']"));
	    search.sendKeys("vegetables");
	
	    
        Thread.sleep(2000);
        List<WebElement> vegetables = driver.findElements(By.xpath("//div[@class='Product__UpdatedTitle-sc-11dk8zk-9 hxWnoO']"));
        Thread.sleep(2000);
        for(int i=0;i<vegetables.size();i++)
        {
        	
        	if(vegetables.get(i).getText().equals("Red Carrot - 500 g (Gajar)"))
        	{
        		vegetables.get(i).click();
        	}
        }
       /* for(WebElement veg:vegetables)
        {
        	if(veg.getText().equals("Red Carrot - 500 g (Gajar)"))
        	{
        		veg.click();
        	}
        }*/
	}

}
