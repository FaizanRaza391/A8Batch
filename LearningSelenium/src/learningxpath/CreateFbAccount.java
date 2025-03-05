package learningxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFbAccount {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");	
		
		//click on First name
				WebElement firstNameTextField=driver.findElement(By.xpath("//input[@name='firstname']"));
				firstNameTextField.sendKeys("Mohan");
			//click on last name	
				WebElement lastNameTextField=driver.findElement(By.xpath("//input[@name='lastname']"));
				lastNameTextField.sendKeys("Raj");
         //click on gender male
				WebElement maleButton=driver.findElement(By.xpath("//label[text()='Male']"));
				maleButton.click();
				
		//click on mobile number text field
				WebElement mobileNumberTextField=driver.findElement(By.xpath("//input[@name='reg_email__']"));
				mobileNumberTextField.sendKeys("8171456789");
				
				//click on password text field
				WebElement passwordTextField=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
				passwordTextField.sendKeys("Mohan123@");
			//click in signup
				WebElement signupButton=driver.findElement(By.xpath("//button[@name='websubmit']"));
				 signupButton.click();
			
	}

}
