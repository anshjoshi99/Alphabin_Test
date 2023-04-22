package TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods {
	WebDriver driver;
	GoogleSearch obj;
	
	@BeforeTest
	public void beforeTest()throws Exception
	{
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			String url = "https://www.google.com/";
			driver.get(url);
			driver.navigate().refresh();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occurring in beforeTest () : " + e.getMessage());
		}
		
	}
	
	@Test
	public void testMethod1() throws Exception
	{
		try {
			
			obj = new GoogleSearch(driver);
			obj.searchMethod("I Phone");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occurring in Test () : " + e.getMessage());
		}
	}
	
	@AfterTest
	public void afterTest() throws Exception
	{
		try {
				Thread.sleep(4000);
				driver.quit();
			
			} catch (Exception e) {
			// TODO: handle exception
				System.out.println("Exception occurring in afterTest() : " + e.getMessage());
		}
	}

}
