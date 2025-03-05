package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClear {

	public static void main(String[] args)
	{
		

		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        
         WebElement username=driver.findElement(By.name("email"));
         username.sendKeys("aman@gmail.com");
         username.clear();
         username.sendKeys("amansingh123@gmail.com");
	}

}
