package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy extends BaseClass{

	public static void main(String[] args) {
		setUp("chrome", 20, "https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=154ddd33-12d5-4475-91bf-61169ea525a6");
		WebElement dragPointer=driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']/div[@class='PYKUdo']"));
	    Actions a=new Actions(driver);
	    
        a.dragAndDropBy(dragPointer,100 , 0).perform();
	}

}
