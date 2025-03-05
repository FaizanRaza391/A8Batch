package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WorkingWithGet {
public static void main(String[] args)
{
	//to launch the browser
	WebDriver driver=new ChromeDriver();
	//to launch the application
	driver.get("https://paytm.com/");
	//to capture the title
	String actualTitle=driver.getTitle();
	String expectedTitle="Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
if(actualTitle.equals(expectedTitle))
	System.out.println("Homepage is displayed");
else
	System.out.println("Homepage is not displayed");
    //to capture the url

String actualUrl=driver.getCurrentUrl();
String expectedUrl="https://paytm.com/";
if(actualUrl.equals(expectedUrl))
	System.out.println("Url is correct");
else
	System.out.println("Url is wrong");

}
}
