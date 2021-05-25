package main;
public class ScreenShot extends baseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScreenShot obj=new ScreenShot();
		driver=obj.launchBrowser("chrome");
		try {
			driver.navigate().to("https://redbus.com");
			System.out.println(driver.getTitle());
			throw new NullPointerException();
		}
		catch(Exception e) {
		e.printStackTrace();
	
	}finally {
		obj.closeBrowserInstance();
			
		}

	}

}
