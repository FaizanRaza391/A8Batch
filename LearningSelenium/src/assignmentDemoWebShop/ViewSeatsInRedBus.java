package assignmentDemoWebShop;

import org.openqa.selenium.By;

public class ViewSeatsInRedBus extends BaseClass {

	public static void main(String[] args) 
	{
		
        setUp("chrome",20,"https://www.redbus.in/bus-tickets/delhi-to-agra?fromCityName=Delhi&fromCityId=733&srcCountry=IND&toCityName=Agra&toCityId=1290&destCountry=IND&onward=12-Mar-2025&opId=0&busType=Any");
        driver.findElement(By.xpath("//li[@id='27307630']/div[text()='View Seats']")).click();	
	
	}

}
