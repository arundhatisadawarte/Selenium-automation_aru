package Group1.SeleniumFramework;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelExecution extends UpdatedBaseClass {
	
  @DataProvider(name="DataObject")
  public Object[][] provideData(){
	  Object[][] obj=new Object[][] {
		  {"Admin","admin123"}
		//  {"avadhut","Sadawarte"},
		//  {"ashvini","Sadawarte"},
		 // {"supriya","Sadawarte"},
		  //{"Admin","admin123"},
		  
	  };
  return obj;
  }
  @Test(dataProvider="DataObject")
  public void method1(String username,String password) throws InterruptedException {
	  System.out.println(username+ " :"+password);
	  driver=launchBrowser("Chrome");
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[@id='divUsername']")).sendKeys(username);
	  driver.findElement(By.xpath("//div[@id='divPassword']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  
	  
	  
  }
}
  
