package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/");	
	
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	

	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();

	driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	
    //Identify the multiselectDropdown
	WebElement multiSelectDropdown=driver.findElement(By.id("select-multiple-native"));
	
	//Create the object of Select Class
	Select s=new Select(multiSelectDropdown);
	
	System.out.println(s.isMultiple());
}


}
