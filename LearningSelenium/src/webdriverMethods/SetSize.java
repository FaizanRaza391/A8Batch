package webdriverMethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Dimension d=new Dimension(500,350);
		driver.manage().window().setSize(d);
		driver.get("https://www.facebook.com");

	}

}
