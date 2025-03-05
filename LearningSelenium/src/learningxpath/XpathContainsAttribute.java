package learningxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsAttribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
		
       //xpath by contains Attribute
		WebElement partialContent=driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/r')]"));
		partialContent.click();

	}

}
