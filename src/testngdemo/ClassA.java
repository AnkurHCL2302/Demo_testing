package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassA {
	
	
	
	@BeforeClass
	public void testcase15()
	{
		System.out.println("this is before class");
	}
	
	
	@BeforeMethod
	public void testcase1()
	{
		System.out.println("this is before method");
	}
	
	
	
	
	@BeforeTest
	public void testcase2()
	{
		System.out.println("this is beforeTest ");
	}
	
	
	@Test (priority =1)
	public void testcase12()
	{
		System.out.println("this is test case case 3");
	}

	@Test (priority=-2, enabled =false)
	public void testcase4()
	{
		System.out.println("this is test case 4");
	}
	
	
	@AfterClass
	public void testcaseaf()
	{
		System.out.println("this is After class");
	}
	
	
	@AfterMethod
	public void testcase1af()
	{
		System.out.println("this is After method");
	}
	
	
	
	
	@AfterTest
	public void testcase2af()
	{
		System.out.println("this is After Test ");
	}


}
