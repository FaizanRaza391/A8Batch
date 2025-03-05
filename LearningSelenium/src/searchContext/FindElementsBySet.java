package searchContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsBySet {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Myntra ka URL open karein
	    driver.get("https://www.myntra.com/men-tshirts"); 
        
        // Sare product names nikalne ke liye findElements() ka use karein
        List<WebElement> products = driver.findElements(By.xpath("//h3[@class='product-brand']")); // Adjust locator if needed
        
        // Unique products store karne ke liye Set ka use karein
        Set<String> uniqueProducts = new HashSet<>();
        
        // Sare product names Set me add karein
        for (WebElement product : products) {
            uniqueProducts.add(product.getText().trim());
        }
        
        // Unique product names print karein
        int count=0;
        System.out.println("Unique Products on Myntra:");
        for (String product : uniqueProducts) {
            System.out.println(product);
            count++;
            System.out.println("===============");
        }
        System.out.println("Total Men T-shirts brands on Mytra are:"+count);
        // Browser close karein
       // driver.quit();
    }


	}


