package learningxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
		
       //click on facebook front content
		WebElement frontContent=driver.findElement(By.xpath("//h2[contains(text(),'F')]"));
		frontContent.click();

	}

}
