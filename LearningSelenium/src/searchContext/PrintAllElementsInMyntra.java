package searchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllElementsInMyntra 
{
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/men-jeans");
	
	List<WebElement> productName=driver.findElements(By.xpath("//h3[@class='product-brand']"));
	 for(WebElement name:productName)
	 {
		System.out.println(name.getText()); 
	 }
	
}

}
