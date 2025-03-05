package webdriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitle
{
	public static void main(String[] args)
	{
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to launch the application
		driver.get("https://www.swiggy.com/");
		//to capture the title
		String actualTitle=driver.getTitle();
		String expectedTitle="Order Food & Groceries. Discover the best restaurants. Swiggy it!";
	if(actualTitle.equals(expectedTitle))
		System.out.println("Title is right");
	else
		System.out.println("Title is wrong");

	}
}
