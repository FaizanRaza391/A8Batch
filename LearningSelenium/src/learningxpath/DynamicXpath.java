package learningxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicXpath 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	
		WebElement searchTextField=driver.findElement(By.name("q"));
		searchTextField.sendKeys("iphone",Keys.ENTER);

		WebElement price=driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Midnight, 128 GB)']/ancestor::a[@href='/apple-iphone-14-midnight-128-gb/p/itmca361aab1c5b0?pid=MOBG6VF5Q82T3XRS&lid=LSTMOBG6VF5Q82T3XRSOXJLM9&marketplace=FLIPKART&q=iphone+13+128&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_9_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_9_na_na_na&fm=search-autosuggest&iid=75663e9d-6ccc-43ca-a944-32837f9ddce9.MOBG6VF5Q82T3XRS.SEARCH&ppt=sp&ppn=sp&ssid=hxali0lasg0000001739533101203&qH=f69496424e64cd29']/descendant::div[text()='₹44,999']"));
		 System.out.println(price.getText());

}
}
