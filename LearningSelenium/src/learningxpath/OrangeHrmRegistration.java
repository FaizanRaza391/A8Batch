package learningxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmRegistration {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
  
		WebElement usernameTextField=driver.findElement(By.name("username"));
        usernameTextField.sendKeys("Admin");
   
        WebElement passwordTextField=driver.findElement(By.name("password"));
        passwordTextField.sendKeys("admin123");
	
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement searchTextField=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchTextField.sendKeys("PIM");
        
        Thread.sleep(2000);
        WebElement pimclick=driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']/ancestor::div[@class='oxd-sidepanel-body']/descendant::a[@href='/web/index.php/pim/viewPimModule']"));
        pimclick.click();
        
        Thread.sleep(2000);
        WebElement clickAddEmployee=driver.findElement(By.linkText("Add Employee"));
        clickAddEmployee.click();
        Thread.sleep(2000);
        WebElement firstNameTextField=driver.findElement(By.xpath("//input[@name='firstName']"));
        firstNameTextField.sendKeys("Mohan");
   
        WebElement midNameTextField=driver.findElement(By.xpath("//input[@name='middleName']"));
        midNameTextField.sendKeys("Raj");
   
        WebElement lastNameTextField=driver.findElement(By.xpath("//input[@name='lastName']"));
        lastNameTextField.sendKeys("Singh");
        Thread.sleep(2000);
        WebElement createLoginDetailsButton=driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
        createLoginDetailsButton.click();   
        Thread.sleep(2000);
        WebElement usernameDetailsTextField=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']/following::input[7]"));
        usernameDetailsTextField.sendKeys("mohan1234");
   
        WebElement passwordDetailsTextField=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']/following::input[10]"));
        passwordDetailsTextField.sendKeys("Mohan123@");
	
        WebElement confirmpasswordTextField=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']/following::input[11]"));
        confirmpasswordTextField.sendKeys("Mohan123@");
	 
        WebElement save=driver.findElement(By.xpath(" //button[text()=' Save '] "));
        save.click();

}
}
