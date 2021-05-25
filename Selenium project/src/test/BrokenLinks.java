package test;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import sun.net.www.protocol.http.HttpURLConnection;

public class BrokenLinks extends baseClassP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrokenLinks obj=new BrokenLinks();
		driver=obj.launchBrowser("chrome");
		driver.navigate().to("https://paytm.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("size of list is:" + links.size());
		for(WebElement element:links) {
			String url=element.getAttribute("href");
			try {
				URL url1=new URL(url);
				HttpURLConnection httpConnection=(HttpURLConnection)url1.openConnection();
				httpConnection.connect();
				if(httpConnection.getResponseCode()!=200)
				{
					System.out.println("The sstatus code is:"+httpConnection.getResponseCode()+"" +url);
				}
				httpConnection.disconnect();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
				}
			}
		}
		

	}


