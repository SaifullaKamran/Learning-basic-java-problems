package automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExamples {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("1st");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("2nd");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("3rd");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("4th");
	}
	@Test
	public void test() {
		System.out.println("5th");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("6th");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("7th");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("8th");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("9th");
	}
	

}
