package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	public WebDriver driver;
	private By username=By.name("username");
	private By password=By.name("password");
	private By submit=By.xpath("//button[@type='submit']");
	private By myInfo=By.xpath("//span[normalize-space()='My Info']");
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	public WebElement enterSubmit()
	{
		return driver.findElement(submit);
	}
	public WebElement ClickMyinfo() 
	{
		return driver.findElement(myInfo);
	}
}
