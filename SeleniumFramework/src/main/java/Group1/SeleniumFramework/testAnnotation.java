package Group1.SeleniumFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testAnnotation {
	@BeforeSuite()
	public void aru()
	{
		System.out.println("This is before suite method");
	}
	
@BeforeTest
public void test()
{
	System.out.println("This is before test method");
}

@BeforeClass
public void sam()
{
	System.out.println("This is before class method");
}
@BeforeMethod
public void anu()
{
	System.out.println("This is before method");
}
@Test
public void asmita()
{
	System.out.println("This is test1 methd");
}
@Test
public void ars()
{
	System.out.println("This is test2 methd");
	
}
@AfterMethod
public void sjh()
{
	System.out.println("This is after method");
}


@AfterClass
public void fsg()
{
	System.out.println("This is after class");
}
@AfterTest
public void jsg()
{
	System.out.println("This is after test");
}
@AfterSuite
public void kfs()
{
	System.out.println("This is after suite");
	
}

}