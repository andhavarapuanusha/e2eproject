package Acedamy;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.Landingpage;
import pageobject.loginpage;
import resources.baseclass;



public class navbar extends baseclass
{
	//for log mechanism log4j
	public static Logger log=LogManager.getLogger(baseclass.class.getName());
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=initilizedriver();
		log.info("driver is intilized");
		driver.get(p.getProperty("url"));
		log.info("navigated to home page");
	}
	@Test
	public void navbarvalidation() throws IOException
	{
		
		//login
		//we can invoke properties of another class using inhertiance orelse by creating objects of that class
		
		Landingpage l=new Landingpage(driver);
		//navbar checking present or not
		Assert.assertTrue(l.navbar().isDisplayed());
		log.info("successfully validated text message");
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	

}
