package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class encapsulation {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdut\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.findElement(By.id("header_srch")).sendKeys("selenium");
		driver.findElement(By.className("input-search-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='Selenium 3.0 Training']")).click();
		System.out.println("The page title is" + driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		  
		
		}

}
