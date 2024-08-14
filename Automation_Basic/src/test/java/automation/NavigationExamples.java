package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationExamples extends BaseDriver{
	@Test
	public void classNameLocators() throws InterruptedException {
		
		driver.manage().window().maximize(); 
		//driver.get("https://demoqa.com/automation-practice-form"); 
		driver.get("https://member.daraz.com.bd/user/register?spm=a2a0e.tm80335401.header.signup.73520PGX0PGXFO");
        WebElement classNameLocator = driver.findElement(By.className("lzd-site-menu-nav-category-label")); 
        classNameLocator.click(); 
		Thread.sleep(7000);
	
		
		driver.navigate().forward();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(7000);
		driver.navigate().refresh();
		Thread.sleep(7000);
		driver.navigate().to("https://m.cricbuzz.com/");
		Thread.sleep(7000);
	}

}
