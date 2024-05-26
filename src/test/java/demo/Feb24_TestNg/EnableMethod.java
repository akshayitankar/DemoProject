package demo.Feb24_TestNg;

import org.testng.annotations.Test;

public class EnableMethod {
	@Test(enabled = false)
	public void driverInitialization()
	{
		System.out.println("code to initialization");
	}
	@Test
	public void enteringTheURL()
	{
		System.out.println("launch the url");
	}
	@Test
	public void enteringTheCredientials()
	{
		System.out.println("entering crediential");
	}
	@Test
	public void CloseTheURL()
	{
		System.out.println("Close the brawser");
	}
}
