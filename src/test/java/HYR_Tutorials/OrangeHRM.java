package HYR_Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
	@Test
	public void AppLaunch() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	}
	 @Test
	public void LoginDetails() throws Exception {
	WebElement TxtUser=driver.findElement(By.name("username"));
	TxtUser.click();
	TxtUser.sendKeys("Admin");
	Thread.sleep(1000);
	WebElement TxtPass=driver.findElement(By.name("password"));
	TxtPass.click();
	TxtPass.sendKeys("admin123");
	WebElement Submit=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	Submit.click();
	}
	 
	 @Test
	 public void navigate_MyInfo() {
		 driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
	 }
	
	 @Test
	 public void verifyMy_Info() {
		 System.out.println(driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).isDisplayed());
	 }
}
