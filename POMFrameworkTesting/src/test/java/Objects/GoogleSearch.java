package Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearch extends Locators {
	WebDriver driver;
	
	public GoogleSearch(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public void searchMethod(String searchInput)throws Exception
	{
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath(searchBox_xPath)).sendKeys(searchInput);
			Thread.sleep(5000);
			driver.findElement(By.xpath(searchIcon_xPath)).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath(websiteLink_xPath)).click();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occurring in searchMethod() : " + e.getMessage());
		}
		
	}


}
