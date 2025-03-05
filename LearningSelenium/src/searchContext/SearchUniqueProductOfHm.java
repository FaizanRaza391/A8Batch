package searchContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchUniqueProductOfHm {public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	// Myntra ka URL open karein
    driver.get("https://www.myntra.com/hm-jeans-men?extra_search_param=isautosuggestentry%3atrue%3a%3aid%3a2297-hm-jeans-men&rawQuery=Hm%20Jeans%20Men"); 
    
    // Sare product names nikalne ke liye findElements() ka use karein
    List<WebElement> products = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']")); // Adjust locator if needed
    
    // Unique products store karne ke liye Set ka use karein
    Set<String> uniqueProducts = new HashSet<>();
    
    // Sare product names Set me add karein
    for (WebElement product : products) {
        uniqueProducts.add(product.getText().trim());
    }
    
    // Unique product names print karein
    System.out.println("Unique Products on Myntra:");
    int count=0;
    for (String product : uniqueProducts) {
        System.out.println(product);
        count++;
        System.out.println("====================");
    }
    System.out.println("Total unique elements are:"+count);
    // Browser close karein
    driver.quit();
}




}
