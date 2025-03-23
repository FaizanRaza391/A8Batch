package learningxpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateDelhiMetro {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://delhimetrorail.com/");	
		
		//click on From Station
		WebElement fromTextField=driver.findElement(By.xpath("//input[@id='FromStation']"));
		fromTextField.click();
		
		//click on Line3
		WebElement line3 = driver.findElement(By.xpath("//div[text()='NOIDA ELECTRONIC CITY']"));
		line3.click();

		//click on Dwarka sector-8
		WebElement station = driver.findElement(By.xpath("//font[text()='DWARKA SECTOR - 8']"));
		station.click();
		
		  //click on To Station
		WebElement toTextField=driver.findElement(By.xpath("//input[@id='ToStation']"));
		toTextField.click();
		
		//click on Line3
		WebElement toline3 = driver.findElement(By.xpath("//div[text()='NOIDA ELECTRONIC CITY']"));
		toline3.click();
		
		//click on DWARKA SECTOR - 10
		WebElement tostation = driver.findElement(By.xpath("//font[text()='DWARKA SECTOR - 10']"));
		tostation.click();
		Thread.sleep(2000);
		//click on Route and fare button
		
		WebElement scrollTill = driver.findElement(By.xpath("//button[text()='Show Route & Fare']"));
		
		//perform explicit typecasting
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(false)",scrollTill);
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//button[text()='Show Route & Fare']")).click();
		
		//click on close popup
		WebElement closePopup= driver.findElement(By.xpath("//button[@id='buttonDismiss1']"));
		closePopup.click();
		
		for(int i=0;i<3;i++)
		{
		
        driver.findElement(By.xpath("//li[text()='+']")).click();
      }

		
		      }
}