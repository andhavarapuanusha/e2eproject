package pageobject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public Landingpage(WebDriver driver) //this driver is coming from homepageclass
	{
		this.driver=driver;//this is variable which is defined in this class
	}

	
    WebDriver driver;
	By login=By.linkText("Login");
	By title=By.cssSelector(".text-center>h2");
	By navbar=By.cssSelector(".nav.navbar-nav.navbar-right");
	
	public WebElement login()
	{
		return driver.findElement(login);
	}
	public WebElement title()
	{
		return driver.findElement(title);
	}
	public WebElement navbar()
	{
		return driver.findElement(navbar);
	}
	
	

}
