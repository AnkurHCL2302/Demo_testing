package testngdemo;

import org.testng.annotations.Test;

public class classC {
	
	
@Test (groups = {"functional", "Regression"})
public void method1()
{

	System.out.println("this method double");
}





@Test (groups = {"Regression"})
public void method2()
{

	System.out.println("this method2");
}
	



@Test (groups = {"Smoke"})
public void method3()
{

	System.out.println("this method2");
}


@Test(groups ={"sanity"})
public void method4(){


	System.out.println("this method2");
}




	

}
