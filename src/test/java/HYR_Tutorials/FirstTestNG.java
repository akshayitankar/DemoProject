package HYR_Tutorials;

import java.awt.RenderingHints.Key;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestNG {
	@org.testng.annotations.Test
	public void TestGoogle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement Search=driver.findElement(By.name("q"));
		Search.click();
		Search.sendKeys("Facebook",Keys.ENTER);
		driver.close();
	}
	@org.testng.annotations.Test
	public void TestInstagram() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2F&is_from_rle");
		Thread.sleep(2000);
		WebElement Search=driver.findElement(By.name("username"));
		Search.click();
		Search.sendKeys("Akshay",Keys.ENTER);
		driver.close();
	}

}
