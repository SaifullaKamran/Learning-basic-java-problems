package automation;

import org.testng.annotations.Test;

public class OpenUrl extends BaseDriver{
	String url = "https://testng.org/";
	@Test
	public void testUrl() {
		driver.manage().window().maximize(); //maximizing browser
		driver.get(url); //will call the url 
	}
	
	

}
