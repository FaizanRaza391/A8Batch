package searchContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-jeans");
		
		WebElement product=driver.findElement(By.xpath("//div[@class='product-productMetaInfo']"));
		product.click();
		
		}
	}


