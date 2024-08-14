package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElements extends BaseDriver{
	
	public void clearElements() throws InterruptedException {
	driver.manage().window().maximize(); 
	driver.get("https://demoqa.com/automation-practice-form"); 
    WebElement firstName = driver.findElement(By.id("firstName"));
	firstName.sendKeys("Saifulla");
	Thread.sleep(7000);
	firstName.clear();
	firstName.sendKeys("Kamran");
	Thread.sleep(7000); 
	}
	
	public void attributeElement() throws InterruptedException {
		driver.manage().window().maximize(); 
		driver.get("https://demoqa.com/automation-practice-form"); 
	    WebElement attribute = driver.findElement(By.id("lastName"));
		System.out.println(attribute.getAttribute("placeholder"));
		Thread.sleep(7000);
		 
		}
	@Test
	public void textElement() throws InterruptedException {
		driver.manage().window().maximize(); 
		driver.get("https://demoqa.com/automation-practice-form"); 
	    WebElement text = driver.findElement(By.xpath("//*[@class='text-center']"));
		System.out.println(text.getText());
		Thread.sleep(7000);
		 
		}
}
