package learningxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import actionsClass.BaseClass;

public class AtomatePaytmByActionsClass extends BaseClass
{
	public static void main(String[] args) {

		setUp("edge", 20, "https://www.paytm.com");
		WebElement paymentsAndServices =driver.findElement(By.xpath("//li[text()='Payments & Services']"));
		Actions a = new Actions(driver);
		a.moveToElement(paymentsAndServices).perform();
		driver.findElement(By.xpath("//a[text()='Payments']")).click();
		WebElement clickOnBillPaymentsAndRecharge=driver.findElement(By.xpath("//a[text()='Bill Payments & Recharges']"));
		 clickOnBillPaymentsAndRecharge.click();
	}
	

}
