package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass extends BaseDriver{
	@Test
	public void actionSelectClass() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://www.daraz.com.bd/beauty-health/?spm=a2a0e.pdp_revamp.breadcrumb.1.176b5328bNYsJp");
	
	Actions action= new Actions(driver);
	WebElement categories=driver.findElement(By.xpath("//span[contains(text(),'Categories')]"));
	action.moveToElement(categories).build().perform();
	Thread.sleep(7000);
	
	WebElement groceries=driver.findElement(By.xpath("//span[contains(text(),'Groceries')]"));
	action.moveToElement(groceries).build().perform();
	Thread.sleep(7000);
	}
	

}
