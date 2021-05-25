package Group1.SeleniumFramework;



import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


import org.openqa.selenium.By;



public class NewTest extends UpdatedBaseClass {


@DataProvider(name="DataObject")
public Object[][] provideData() {


Object[][] obj = new Object[][] {


{ "Admin", "admin123" }, 
{ "username2", "password2" }, 
{ "username3", "password3" }, 
{ "username4", "password4" }, 
{ "username5", "password5" }, 


};
return obj;


}


@Test(dataProvider = "DataObject")
public void method1(String username, String password) throws InterruptedException {

System.out.println(username + " : " + password);

driver=launchBrowser("Chrome");
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
Thread.sleep(3000);

driver.findElement(By.xpath("//div[@id='divUsername']")).sendKeys(username);
driver.findElement(By.xpath("//div[@id='divPassword']")).sendKeys(password);
driver.findElement(By.xpath("//input[@id='btnLogin']")).click();





}


}