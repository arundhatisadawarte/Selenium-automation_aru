import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class baseClass {
	public static WebDriver driver;
	public WebDriver launchBrowser(String browserName)
	{
	switch(browserName)
		{
		case "chrome":
			System.setProperty("WebDriver.chrome.driver","C:\\Users\\Abdut\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			return driver;
			
		case "Mozilla":
			System.setProperty("WebDriver.firefox.driver","C:\\Users\\Abdut\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new FirefoxDriver();
			return driver;
			System.setProperty("WebDriver.chrome.driver","C:\\Users\\Abdut\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			return driver;
		}
	}
	public void selectByIndex(WebElement element,int index) {
		Select select=new Select(element);
		Select.selectByIndex(index);
	}
	public void selectByValue(WebElement element,String value) {
		Select select=new Select(element);
		Select.selectByValue(value);
	}
	public void selectByVisibletext(WebElement element,String visibleText)
	{
	Select select=new Select(element);
	Select.selectByVisibleText(visibleText);
}
public String generateEmailId()
{
	return " ";
	

}
	}
	

