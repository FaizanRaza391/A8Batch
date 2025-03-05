package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");	
	
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		//for day dropdown
		
		//identify the static dropdown
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		//create the object of select class
		Select s=new Select(day);
		//use the methods
		s.selectByVisibleText("15");
		
		//for month dropdown
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select sm=new Select(month);
		sm.selectByVisibleText("Sep");
		
		//for year dropdown
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select ye=new Select(year);
		ye.selectByVisibleText("1996");
	

	}

}
