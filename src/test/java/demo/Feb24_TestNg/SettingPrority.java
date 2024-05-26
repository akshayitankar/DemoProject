package demo.Feb24_TestNg;

import org.testng.annotations.Test;

public class SettingPrority {
	@Test(priority = 1)
	public void driverInitialization()
	{
		System.out.println("code to initialization");
	}
	@Test(priority = 2)
	public void enteringTheURL()
	{
		System.out.println("launch the url");
	}
	@Test(priority = 3)
	public void enteringTheCredientials()
	{
		System.out.println("entering crediential");
	}
	@Test(priority = 4)
	public void CloseTheURL()
	{
		System.out.println("Close the brawser");
	}
	
	//we can set the priority based on character also
}
