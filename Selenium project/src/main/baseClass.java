package main;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class baseClass {


public static WebDriver driver;


public WebDriver launchBrowser(String browserName) {

switch (browserName) {


case "Chrome":
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdut\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver(setCapabilitiesForChrome());
return driver;


case "Mozila":

	  System.setProperty("webdriver.firefox.driver","C:\\Users\\Abdut\\Downloads\\chromedriver_win32\\chromedriver.exe");


		return driver = new FirefoxDriver();

default:

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdut\\Downloads\\chromedriver_win32\\chromedriver.exe");


	driver = new ChromeDriver();
	return driver;


}


}


public void closeBrowserInstance() {


driver.quit();
}


public void selectByIndex(WebElement element, int index) {


Select select = new Select(element);
select.selectByIndex(index);


}


public void selectByValue(WebElement element,String value) {


Select select = new Select(element);
select.selectByValue(value);


}


public void selectByVisibletext(WebElement element, String visibleText) {


Select select = new Select(element);
select.selectByVisibleText(visibleText);


}


public ChromeOptions setCapabilitiesForChrome() {

ChromeOptions profile=new ChromeOptions();

profile.addArguments("start-maximized");

profile.addArguments("--disable-notifications");

profile.addArguments("--incognito");

// profile.addArguments("--headless");

// profile.addExtensions(new File("C:\\Users\\danghar\\Downloads\\extension_6_1_11_0.crx"));

profile.addArguments("--disable-extension");

profile.addArguments("--disable-popup-blocking");

// profile.addArguments("--auto-open-devtools-for-tabs");

Map<String, Object> map=new HashMap<String,Object>();
map.put("download.default_directory", "E:\\Arundhati\\selenium");

profile.setExperimentalOption("prefs", map);


return profile;

}

public FirefoxOptions setCapabilitiesForMozila() {

FirefoxOptions option=new FirefoxOptions();
option.addArguments("start-maximized");

option.addArguments("--disable-notifications");

option.addArguments("--incognito");

// profile.addArguments("--headless");

// profile.addExtensions(new File("C:\\Users\\danghar\\Downloads\\extension_6_1_11_0.crx"));

option.addArguments("--disable-extension");

option.addArguments("--disable-popup-blocking");

option.addArguments("--auto-open-devtools-for-tabs");

return option;

}

public void captureScreenShot(String filePath) {

try {

TakesScreenshot takeScreenShot=(TakesScreenshot)driver;

File file=takeScreenShot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file,new File("E:\\Arundhati\\selenium"));


} catch (IOException e) {
e.printStackTrace();
}
}

}