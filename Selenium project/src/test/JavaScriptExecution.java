package test;

//program to go on paytm,select mobile ,add to cart,check prize of product match with another prize
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecution extends baseClassP {

	public static void main(String[] args) {
	JavaScriptExecution javaScriptExe=new JavaScriptExecution();
	driver=javaScriptExe.launchBrowser("chrome");
	driver.navigate().to("http://paytm.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	driver.navigate().refresh();
	Wait<WebDriver> wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-reactid='507']"))));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div/div/div/div/div[1]/div[3]/div/a/div[1]/img")).click();
	js.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div/div[4]/div[2]/div[1]/div[2]/div/a/div[2]/div[1]/div")).click();
	js.executeScript("window.scrollBy(0,500)");
	js.executeScript("argument[0].click();",(driver.findElement(By.xpath("//span[@class='_1_vy']"))));
	
	
	
	

	
	//js.executeScript("argument[0].click();", driver.findElement(By.
	//driver.findElement(By.xpath("//div[@data-reactid='507"));

	
	
	

	}

}
