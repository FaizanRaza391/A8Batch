package windowBasedPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actionsClass.BaseClass;



public class FileUpload extends BaseClass {

	public static void main(String[] args) {

		setUp("chrome", 10, "https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		WebElement fileUpload = driver.findElement(By.id("fileInput"));
		fileUpload.sendKeys("C:\\Users\\faiza\\Downloads\\Faizan%20Raza%20resume.pdf");
		
	}

}
