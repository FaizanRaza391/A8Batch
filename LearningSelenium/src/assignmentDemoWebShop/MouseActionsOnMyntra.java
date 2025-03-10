package assignmentDemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;



public class MouseActionsOnMyntra extends BaseClass
{

	public static void main(String[] args)
	{
		setUp("chrome",20,"https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=Cj0KCQjwm7q-BhDRARIsACD6-fWBTnhiUeGzsiHluU396PcYPNXdQ5MxoFLNXnALpj67Ie_uRjy4NBMaAvb3EALw_wcB");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Beauty']"))).perform();
		driver.findElement(By.xpath("//a[text()='Perfume']")).click();
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Recommended']"))).perform();
		driver.findElement(By.xpath("//label[text()='Price: Low to High']")).click();
	}
}
