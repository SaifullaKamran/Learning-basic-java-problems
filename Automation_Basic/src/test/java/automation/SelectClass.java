package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClass extends BaseDriver {
	@Test
	public void selectClassMethod() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	    Thread.sleep(7000);
		WebElement selectOptions =driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select=new Select(selectOptions);
		select.selectByIndex(4);
		Thread.sleep(7000);
		
		select.selectByVisibleText("Girls' Fashion");
		Thread.sleep(7000);
	}

}
