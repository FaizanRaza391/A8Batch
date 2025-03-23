package frames;

import org.openqa.selenium.WindowType;

import actionsClass.BaseClass;

public class OpenANewBlankWindow extends BaseClass{
public static void main(String[] args) {
		
		setUp("chrome", 20, "https://www.facebook.com");
		
		//if we want to open a blank tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.get("https://www.instagram.com");
	}

}
