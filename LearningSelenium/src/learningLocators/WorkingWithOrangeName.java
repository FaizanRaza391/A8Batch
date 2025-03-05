package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithOrangeName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
  
		WebElement usernameTextField=driver.findElement(By.name("username"));
        usernameTextField.sendKeys("Admin");
   
        WebElement passwordTextField=driver.findElement(By.name("password"));
        passwordTextField.sendKeys("admin123");
	
        WebElement loginButton=driver.findElement(By.className("login-button"));
        loginButton.click();

	}

}
