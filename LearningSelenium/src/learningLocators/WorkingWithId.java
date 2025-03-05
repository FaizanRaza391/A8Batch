package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithId {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
   WebElement usernameTextField=driver.findElement(By.id("email"));
   usernameTextField.sendKeys("faizan");
   
   WebElement passwordTextField=driver.findElement(By.id("pass"));
   passwordTextField.sendKeys("1234567");
	}

}
