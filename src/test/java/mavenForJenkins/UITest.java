package mavenForJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest 
{
	@Test
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		Assert.assertTrue(driver.getTitle().contains("Google"), "Title doesnot match");
		driver.quit();
		
	}

}
