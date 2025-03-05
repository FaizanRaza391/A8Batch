package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllElementsOneByOne {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");	
	
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//SELECT DAYS ONE BY ONE WITH THE HELP OF INDEXING
	/*	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	
		Select s=new Select(day);
		
		for(int i=0;i<31;i++)
		{
		s.selectByIndex(i);
		}
		*/
		
		//SELECT MONTH ONE BY ONE WITH THE HELP OF INDEXING
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select sm=new Select(month);
		for(int i=0;i<12;i++)
		{
			sm.selectByIndex(i);
		}
		
		

	}

}
