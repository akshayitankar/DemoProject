package demo.Feb24_TestNg;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModule.LoginPageObject;
import Resources.BaseClass;

public class VerifyLogin extends BaseClass{
	@SuppressWarnings("deprecation")
	@Test
	public void verifyLoginButton() throws InterruptedException, IOException
	{
		driverInitialize();
		Thread.sleep(2000);
		LoginPageObject lop=new LoginPageObject(driver);
		lop.enterUsername().sendKeys("Admin");
		Thread.sleep(2000);
		lop.enterPassword().sendKeys("admin123");
		Thread.sleep(2000);
		lop.enterSubmit().click();
		Thread.sleep(2000);
		
		//Appling Assertions
//		String TittleExpected="orangeHRM";
//		String TittleActual=driver.getTitle();
//		Assert.assertEquals(TittleExpected, TittleActual);
//		System.out.println("You have sucessfully Login");
		WebElement dashboard=driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']"));
		Thread.sleep(2000);
	     Assert.assertTrue(dashboard.isDisplayed());
		Thread.sleep(2000);
		System.out.println("You have sucessfully Login");
		
	}
 
}
