package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassB {

	
	@Test (priority =1)
	public void testcase1()
	{
		System.out.println("this is test case 1b with priority 2");
	}

	
	
	@AfterClass
	public void testcase2b()
	{
		System.out.println("this is AfterClass");
	}
	
	
	@AfterMethod
	public void testcase3b()
	{
		System.out.println("this is AfterMethod");
	}

	@AfterTest
	public void testcase4b()
	{
		System.out.println("this is AfterTest");
	}

}
