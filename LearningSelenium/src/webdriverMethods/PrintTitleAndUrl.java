package webdriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintTitleAndUrl {
	public static void main(String[] args)
	{
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to launch the application
		driver.get("https://www.zomato.com/");
		//to capture the title
		String actualTitle=driver.getTitle();
		
		System.out.println("Title is:"+actualTitle);
	
	    //to capture the url

	String actualUrl=driver.getCurrentUrl();
	
		System.out.println("URL is:"+actualUrl);

	}

}
