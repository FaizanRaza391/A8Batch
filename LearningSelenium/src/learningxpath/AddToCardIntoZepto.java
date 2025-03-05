package learningxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCardIntoZepto 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zeptonow.com/");
		//click on searchField
			//	WebElement searchField=driver.findElement(By.xpath("//span[@data-testid='searchBar']"));
			//	searchField.sendKeys("Portronics Konnect A Trio 3-In-1 USB Cable - Black | Braided and High-Speed | Fast Charging",Keys.ENTER);
		WebElement addToCart=driver.findElement(By.xpath("//h5[text()='Portronics Konnect A Trio 3-In-1 USB Cable - Black | Braided and High-Speed | Fast Charging']/ancestor::a[@class='block !w-32 md:!h-[19.5rem] md:!w-40 relative z-0 my-3 group bg-white pb-2 min-w-[10rem] rounded-lg md:w-[9.5rem] !h-[18.75rem] sm:!h-[18.75rem] lg:!h-[18.75rem]']/descendant::span[text()='Add to Cart']"));
		addToCart.click();
}
}