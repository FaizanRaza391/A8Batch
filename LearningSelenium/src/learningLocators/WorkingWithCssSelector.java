package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");	
	
	//search element
	WebElement searchTextField=driver.findElement(By.cssSelector("input[type='text']"));
	searchTextField.sendKeys("iphone",Keys.ENTER);

}
}
