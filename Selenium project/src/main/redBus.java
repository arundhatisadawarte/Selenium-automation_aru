package main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;

public class redBus extends baseClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdut\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.id("src")).sendKeys("pune"+Keys.ENTER);
		//driver.findElement(By.xpath("//li[@data-id='130']"+Keys.ENTER));
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("mumbai"+Keys.ENTER);
		
	 //Wait<Webdriver>wait=new webDriverWait(driver,10);
	 //Wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ul[@class='autoFill']/child::li[1]"))));
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//ul[@class='autoFill']/child::li[1]"));
	
		
		
		
		
		
		
	}
	

}
