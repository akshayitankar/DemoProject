package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PersonalDetaitsPageObject {

		public WebDriver driver;
		private By personalDetails=By.linkText("Personal Details");
		private By FirstName=By.xpath("//input[@placeholder='First Name']");
		private By MiddleName=By.xpath("//input[@placeholder='Middle Name']");
		private By LastName=By.xpath("//input[@placeholder='Last Name']");
		private By EmpID=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
		private By OtherID=By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/input[1]");
		private By DL=By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[2]/div[1]/div[1]/div[2]/input[1]");
		private By DLexper=By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
		private By Nationality=By.xpath("//div[contains(text(),'American')]");
		private By Marital_status=By.xpath("//div[contains(text(),'Other')]");
		
		public PersonalDetaitsPageObject(WebDriver driver2) {
			this.driver=driver2;
		}

		public WebElement personaldetailsinfo() 
		{
			return driver.findElement(personalDetails);
		}
		public WebElement FirstNameClick() 
		{
			return driver.findElement(FirstName);
		}
		public WebElement MiddleName() 
		{
			return driver.findElement(MiddleName);
		}
		public WebElement LastName() 
		{
			return driver.findElement(LastName);
		}
		public WebElement EmpID() 
		{
			return driver.findElement(EmpID);
		}
		public WebElement OtherID() 
		{
			return driver.findElement(OtherID);
		}
		public WebElement DL() 
		{
			return driver.findElement(DL);
		}
		public WebElement DLexpery() 
		{
			return driver.findElement(DLexper);
		}
		public WebElement Nationality() 
		{
			return driver.findElement(Nationality);
		}
		public WebElement Mstatus()
		{
			return driver.findElement(Marital_status);
		}
}
