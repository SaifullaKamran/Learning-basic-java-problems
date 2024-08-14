package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserCommands extends BaseDriver{
	@Test
	public void classNameLocators() throws InterruptedException {
		
		driver.manage().window().maximize(); 
		//driver.get("https://demoqa.com/automation-practice-form"); 
		driver.get("https://member.daraz.com.bd/user/register?spm=a2a0e.tm80335401.header.signup.73520PGX0PGXFO");
        WebElement classNameLocator = driver.findElement(By.className("lzd-site-menu-nav-category-label")); 
        classNameLocator.click(); 
		Thread.sleep(7000);
		String newUrl=driver.getCurrentUrl();
		System.out.println(newUrl);
		String tittle=driver.getTitle();
		System.out.println(tittle);
	}

}
