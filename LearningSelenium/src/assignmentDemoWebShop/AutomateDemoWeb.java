package assignmentDemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDemoWeb {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");	
		
		//click on register
		WebElement register=driver.findElement(By.cssSelector("a[href='/register']"));
		register.click();

		WebElement maleRadioButton=driver.findElement(By.cssSelector("input[id='gender-male']"));
		maleRadioButton.click();
		
		WebElement firstName=driver.findElement(By.cssSelector("input[id='FirstName']"));
		firstName.sendKeys("Mohan");
		
		WebElement lastName=driver.findElement(By.cssSelector("input[id='LastName']"));
		lastName.sendKeys("Kumar");
		
		WebElement email=driver.findElement(By.cssSelector("input[id='Email']"));
		email.sendKeys("krfohan198@gmail.com");
		
		WebElement password=driver.findElement(By.cssSelector("input[id='Password']"));
		password.sendKeys("mohan123");
		
		WebElement confirmPassword=driver.findElement(By.cssSelector("input[id='ConfirmPassword']"));
		confirmPassword.sendKeys("mohan123");
		
		WebElement registerButton=driver.findElement(By.cssSelector("input[id='register-button']"));
		registerButton.click();
		
		
		
	}

}
