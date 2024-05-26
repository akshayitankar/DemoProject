package www.personaldetails.com;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModule.LoginPageObject;
import PageObjectModule.PersonalDetaitsPageObject;
import Resources.BaseClass;

public class EmployessContact extends BaseClass{
	



	@Test
	public void verifyFieldEditable() throws InterruptedException, IOException
	{driverInitialize();
	Thread.sleep(2000);
	LoginPageObject lop=new LoginPageObject(driver);
	lop.enterUsername().sendKeys("Admin");
	Thread.sleep(1000);
	lop.enterPassword().sendKeys("admin123");
	Thread.sleep(1000);
	lop.enterSubmit().click();
	Thread.sleep(3000);
	lop.ClickMyinfo().click();
	Thread.sleep(1000);
	PersonalDetaitsPageObject pds=new PersonalDetaitsPageObject(driver);
	pds.personaldetailsinfo().click();
	Thread.sleep(1000);
	pds.FirstNameClick().click();
	WebElement firstNameField = pds.FirstNameClick();

	for(int i = 0; i <10 ; i++) 
	{
	firstNameField.sendKeys(Keys.BACK_SPACE);
	}
	Thread.sleep(1000);
	pds.FirstNameClick().sendKeys("akshay");
	Thread.sleep(1000);
	Assert.assertNotNull(pds.FirstNameClick().getText());
	System.out.println("TF of First name is working...");
	pds.MiddleName().click();
	WebElement middleNameField = pds.MiddleName();
	for(int i = 0; i < 10; i++) 
	{
		middleNameField.sendKeys(Keys.BACK_SPACE);
	}
	Thread.sleep(1000);
	pds.MiddleName().sendKeys("Bandu");
	Thread.sleep(1000);
	Assert.assertNotNull(pds.MiddleName().getText());
	System.out.println("TF of middle name is working...");
	pds.LastName().click();
	Thread.sleep(1000);
	WebElement LastNameField = pds.LastName();
	for(int i = 0; i < 10; i++) 
	{
		LastNameField.sendKeys(Keys.BACK_SPACE);
	}
	Thread.sleep(1000);
	pds.LastName().sendKeys("Itankar");
	Thread.sleep(1000);
	Assert.assertNotNull(pds.LastName().getText());
	System.out.println("TF of Last name is working...");
	pds.EmpID().click();
	Thread.sleep(1000);
	WebElement EmpIDField = pds.EmpID();
	for(int i = 0; i < 10; i++) 
	{
		EmpIDField.sendKeys(Keys.BACK_SPACE);
	}
	Thread.sleep(1000);
	pds.EmpID().sendKeys("12345");
	Thread.sleep(1000);
	Assert.assertNotNull(pds.EmpID().getText());
	System.out.println("TF of EMP ID is working...");
	pds.OtherID().click();
	WebElement otherIDField = pds.OtherID();
	for(int i = 0; i < 10; i++) 
	{
		otherIDField.sendKeys(Keys.BACK_SPACE);
	}
	Thread.sleep(1000);
	pds.OtherID().sendKeys("Emp123");
	Thread.sleep(1000);
	Assert.assertNotNull(pds.OtherID().getText());
	System.out.println("TF of other ID is working...");
	pds.DL().click();
	WebElement DLField = pds.DL();
	for(int i = 0; i < 10; i++) 
	{
		DLField.sendKeys(Keys.BACK_SPACE);
	}
	Thread.sleep(2000);
	pds.DL().sendKeys("E12334");
	Thread.sleep(2000);
	Assert.assertNotNull(pds.DL().getText());
	System.out.println("TF of Driving licence is working...");
	pds.DLexpery().click();
	WebElement DLexperyField = pds.DLexpery();
	for(int i = 0; i < 10; i++) 
	{
		DLexperyField.sendKeys(Keys.BACK_SPACE);
	}
	Thread.sleep(2000);
	pds.DLexpery().sendKeys("2024-12-12");
	Thread.sleep(2000);
	Assert.assertNotNull(pds.DLexpery().getText());
	System.out.println("TF of Driving licence expery is working...");
	Thread.sleep(2000);
    pds.Nationality().click();
     Thread.sleep(3000);
     
    pds.Mstatus().click();
    Thread.sleep(3000);
	
	
	
	
	}

}
