package Group1.SeleniumFramework;




	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeGroups;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterGroups;


	public class amazonTestCases {


	@BeforeClass
	public void beforeClass() {
	System.out.println("This is before class");
	}

	@AfterClass
	public void afterClass() {
	System.out.println("This is after class");
	}

	@BeforeGroups("group1")
	public void beforeGroup() {


	System.out.println("This is before group method from amazon class");
	}


	@AfterGroups("group1")
	public void afterGroups() {


	System.out.println("This is after group method from amazon class");
	}


	@Test(groups = "group2")
	public void Test1() {


	System.out.println("This is Test1 Method");
	}

	@Test(groups = "group1")
	public void Test2() {


	System.out.println("This is Test2 Method");
	
	}




	}




