package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class robotClass extends baseClassP {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		robotClass obj=new robotClass();
		driver=obj.launchBrowser("chrome");
		driver.navigate().to("https://paytm.com");
		WebElement productLink=driver.findElement(By.xpath("//*[@data-reactid='269']"));
		Actions act=new Actions(driver);
		act.contextClick(productLink).perform();
		Robot robot=new Robot();
		//robot.mouseMove(1000, 2000);
	//	robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		//robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.keyPress(keyEvent.VK_DOWN);
		robot.keyRelease(keyEvent.VK_DOWN);
		robot.keyPress(keyEvent.VK_ENTER);
		robot.keyRelease(keyEvent.VK_ENTER);
		
		

	}

}
