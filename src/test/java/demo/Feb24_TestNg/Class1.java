package demo.Feb24_TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void A1()
	{
		System.out.println("test A1 execute first because of alphabetic order@test");
	}
	@Test
	public void B1()
	{
		System.out.println("test A1 execute first because of alphabetic order@test");
	}
	@BeforeMethod
	public void m1()
	{
		System.out.println("This code will execute before each and every @test annoted method");
	}
	@AfterMethod
	public void m2()
	{
		System.out.println("This code will execute after each and every @test annoted method");
	}
}
