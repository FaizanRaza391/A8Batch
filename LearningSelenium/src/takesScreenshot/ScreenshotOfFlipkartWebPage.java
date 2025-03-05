package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfFlipkartWebPage {
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
	   //explicit type casting
		TakesScreenshot t=(TakesScreenshot)driver;
		
		//use getScreenshot()
		File src=t.getScreenshotAs(OutputType.FILE);
		//create a new file
		File dest=new File("./Screenshot/flipkart2.png");
		//copy
		Files.copy(src,dest);
		
		  WebElement st=driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/1620/270/image/295f4edb9caccf66.jpeg?q=20']"));
			
			//use getScreenshotAs()
			File src1=st.getScreenshotAs(OutputType.FILE);
			//create a new file
			File dest1=new File("./Screenshot/imagechange.png");
			//copy
			Files.copy(src1,dest1);

	}

}
