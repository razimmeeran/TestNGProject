/**
 * 
 */
package mavenForJenkins;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Syntax {
	public static WebDriver driver;
	
	
	public void practice()
	{
		//WebDriver setup
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();	
				driver.get("https://www.google.com");	
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				WebElement test = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[id='text'])")));
	}
	
	public static void Action()
	{
		WebElement source = driver.findElement(By.xpath("//*[id='text']"));
		WebElement destination = driver.findElement(By.xpath("//*[id='text']"));
		
		
		Actions action = new Actions(driver);	
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		action.sendKeys(element, "iphone").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[id='text']"))).build().perform();
		action.clickAndHold(source).moveToElement(destination).release().build().perform();
				
	}
	
	public static void Select()
	{		
		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByVisibleText(null);
		select.selectByIndex(0);
		select.selectByValue(null);	
	}
	
	public static void Alert()
	{	
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("text");
		alert.accept();
		alert.dismiss();		
	}
	
	public static void Robert() throws AWTException
	{	
		Robot rb = new Robot();	
		rb.keyPress(KeyEvent.VK_1);
	}
	
	public static void main(String[] args) {	
		Syntax obj = new Syntax();
		obj.practice();		
		Syntax.Alert();
	}
}
