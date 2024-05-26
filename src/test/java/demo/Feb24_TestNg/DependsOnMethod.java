package demo.Feb24_TestNg;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void driverInitialization()
	{
		System.out.println("code to initialization");
	}
	@Test(dependsOnMethods = "driverInitialization")
	public void enteringTheURL()
	{
		System.out.println("launch the url");
	}
	@Test
	public void enteringTheCredientials()
	{
		System.out.println("entering crediential");
	}
}
