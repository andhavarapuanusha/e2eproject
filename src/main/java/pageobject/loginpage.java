package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

	public static WebDriver driver;

	public loginpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	By emailaddress=By.id("user_email");
	By password=By.id("user_password");
	By loginbutt=By.name("commit");

	
	public WebElement emailaddress()
	{
		return driver.findElement(emailaddress);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement loginbutt()
	{
		return driver.findElement(loginbutt);
	}
	
	
	

}
