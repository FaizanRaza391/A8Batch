package popups;

import org.openqa.selenium.By;

import actionsClass.BaseClass;

public class HandleSvgTag extends BaseClass{
public static void main(String[] args)
{
setUp("chrome",1,"www.google.com");	

driver.findElement(By.xpath("//*[name()='svg' and @class='gb_F']")).click();

}
}
