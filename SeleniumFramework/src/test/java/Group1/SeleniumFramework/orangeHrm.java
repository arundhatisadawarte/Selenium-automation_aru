package Group1.SeleniumFramework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orangeHrm extends UpdatedBaseClass {
  @BeforeTest
  public void beforeTest() {
	  driver=launchBrowser("chrome");
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	  
  }
  @AfterTest
  public void afterTest() {
  
  
}
@Test
public void login()
{
	
}
@Test
public void logout()
{
	
}
  
  @Test
  public void verify()
  {
	  
  }
}

