package Group1.SeleniumFramework;



	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeGroups;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterGroups;


	public class paytmTestCases {

	@BeforeGroups("group1")
	public void beforeGroup() {


	System.out.println("This is before group method from paytm class");
	}


	@AfterGroups("group1")
	public void afterGroups() {


	System.out.println("This is after group method from paytm class");
	}
	@Test(groups="group1")
	public void paytmtestCase() {
	System.out.println("This is test method from paytm");
	}


	@BeforeClass
	public void beforeClass() {
	}


	@AfterClass
	public void afterClass() {
	}


	}


