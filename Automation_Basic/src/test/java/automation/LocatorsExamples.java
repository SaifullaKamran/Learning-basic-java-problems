package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsExamples extends BaseDriver{
	
	public void idLocators() throws InterruptedException {
		
		driver.manage().window().maximize(); //maximizing window
		driver.get("https://demoqa.com/automation-practice-form"); //url call
        WebElement firstName = driver.findElement(By.id("firstName")); //will find out firstName from the form
		firstName.sendKeys("Saifulla"); // will send Saifulla in firstName field
		Thread.sleep(7000); //thread will hold window for 7 seconds
		
		/*Name element
		WebElement gender = driver.findElement(By.name("male"));
		gender.click();*/}
		
	    
		public void linkLocators() throws InterruptedException{
			driver.manage().window().maximize(); //maximizing window
			driver.get("https://demoqa.com/links");
			WebElement link = driver.findElement(By.linkText("Home"));
			link.click();		
			Thread.sleep(7000);
		} 
		
		public void partialLink() throws InterruptedException{
			driver.manage().window().maximize(); //maximizing window
			driver.get("https://demoqa.com/links");
			WebElement partialLink = driver.findElement(By.partialLinkText("H"));
			partialLink.click();
			Thread.sleep(7000);
		}
		
		public void tagNameLocators() throws InterruptedException {
			
			driver.manage().window().maximize(); 
			driver.get("https://demoqa.com/automation-practice-form"); 
	        List <WebElement> tagNameLocator = driver.findElements(By.tagName("input")); 
	        System.out.println(tagNameLocator.size()); 
			Thread.sleep(7000);
		}
		@Test
		public void classNameLocators() throws InterruptedException {
			
			driver.manage().window().maximize(); 
			//driver.get("https://demoqa.com/automation-practice-form"); 
			driver.get("https://member.daraz.com.bd/user/register?spm=a2a0e.tm80335401.header.signup.73520PGX0PGXFO");
	        WebElement classNameLocator = driver.findElement(By.className("lzd-site-menu-nav-category-label")); 
	        classNameLocator.click(); 
			Thread.sleep(7000);
		}
		
        public void cssSelectorLocators() throws InterruptedException {
			
			driver.manage().window().maximize(); 
		    driver.get("https://demoqa.com/checkbox"); 
			//driver.get("https://member.daraz.com.bd/user/register?spm=a2a0e.tm80335401.header.signup.73520PGX0PGXFO");
	        WebElement cssLocator = driver.findElement(By.cssSelector(".rct-checkbox")); 
	        cssLocator.click(); 
			Thread.sleep(7000);
		}
	}


