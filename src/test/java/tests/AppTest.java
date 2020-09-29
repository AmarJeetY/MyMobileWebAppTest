package tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AppTest extends Base {
	
	@Test
	public void LoginToSauceDemoPortal()
	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();			
	}	
}
