package assignmentDemoWebShop;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class AssignmentPaytmAndPhonepeAuto extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
        setUp("chrome", 20, "https://paytm.com/");
		
		//if we want to open a blank tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		driver.get("https://www.phonepe.com/");
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Our Solutions']"))).perform();
		
		driver.findElement(By.xpath("//span[text()='Offline Payments']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Get your PhonePe POS']")).click();
		
		driver.findElement(By.xpath("//input[@name='storeBrandName']")).sendKeys("Tea Shop");
		
		driver.findElement(By.xpath("//div[text()='How many stores do you have?*']")).click();
		driver.findElement(By.xpath("//div[text()='1 to 3']")).click();
		driver.findElement(By.xpath("//input[@name='postalPincode']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@placeholder='Enter City*']")).sendKeys("Bareilly");
		driver.findElement(By.xpath("//div[text()='What is the Annual Turnover per store?*']")).click();
		driver.findElement(By.xpath("//div[@data-code='<8L']")).click();
		driver.findElement(By.xpath("//span[text()='GST Certificate']")).click();
		driver.findElement(By.xpath("//input[@name='firstAndLastName']")).sendKeys("Mohan kumar");
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("1234567823");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//span[text()='I agree to the']")).click();
		driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
	Set<String> allId = driver.getWindowHandles();
		
		for(String id:allId)
		{
		driver.switchTo().window(id);
		if(driver.getTitle().equals("Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills"))
		{
			break;
		}
		}
		
        a.moveToElement(driver.findElement(By.xpath("//li[text()='Company']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Latest News']")).click();
		Thread.sleep(2000);
       Set<String> alId = driver.getWindowHandles();
		
		for(String id:alId)
		{
		driver.switchTo().window(id);
		if(driver.getTitle().equals("Official Paytm News: Your Trusted Source for Verified Paytm Updates"))
		{
			break;
		}
		}
		
		driver.findElement(By.xpath("//span[text()='Paytm Users Can Now Make UPI Payments In UAE, France And These Countries']/following-sibling::a[text()='Read more']")).click();
		
		driver.get("https://www.ndtv.com/india-news/paytm-users-can-now-make-international-payments-in-these-countries-7119225");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/paytm.png");
		Files.copy(src,dest);
		
			
		}
	}


