package webdriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCloseAndQuit {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement element=driver.findElement(By.linkText("Open a popup window"));
        element.click();
        
        //both methods will not use together we can use only one method at a time
        //close parent window we will use close() method
       // driver.close();
        //close the parent as well as child window
        driver.quit();
        
	}

}
