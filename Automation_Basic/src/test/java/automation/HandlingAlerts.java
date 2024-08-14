package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingAlerts extends BaseDriver {
	@Test
	public void alert() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertButton.click();
		Thread.sleep(7000);
		Alert button =driver.switchTo().alert();
		button.accept();
		Thread.sleep(7000);
		
		WebElement confirmButton= driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmButton.click();
		Alert button1 =driver.switchTo().alert();
		button1.dismiss();
		Thread.sleep(7000);
		
		WebElement promptButton= driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptButton.click();
		Alert button2 =driver.switchTo().alert();
		button2.sendKeys("Saifulla");
		button2.accept();
		Thread.sleep(7000);
	}

}
