package test;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class BrokenLinks1 extends baseClassP{


public static void main(String[] args) {
BrokenLinks obj=new BrokenLinks();

driver=obj.launchBrowser("Chrome");

driver.navigate().to("https://paytm.com");

List<WebElement> links= driver.findElements(By.tagName("a"));

System.out.println("Size of list is: "+ links.size());

for(WebElement element : links) {

String url=element.getAttribute("href");

try {

URL uri=new URL(url);

HttpURLConnection httpConnection=(HttpURLConnection)uri.openConnection();
httpConnection.connect();

if(httpConnection.getResponseCode()!=200) {

System.out.println("The status code is : "+httpConnection.getResponseCode()+ "  "+ url);

}

httpConnection.disconnect();

} catch (Exception e) {

e.printStackTrace();
}


}
}


}