package Acedamy;

import java.io.IOException;

import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Landingpage;
import pageobject.loginpage;
import resources.baseclass;



public class Homepage extends baseclass
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
	@Test(dataProvider="getdata")
	public void basepagenavigation(String username,String password) throws IOException
	{
		//login
		//we can invoke properties of another class using inhertiance orelse by creating objects of that class
		driver.get(p.getProperty("url"));
		Landingpage l=new Landingpage(driver);
		l.login().click();
		
		loginpage lp=new loginpage(driver);
		lp.emailaddress().sendKeys(username);
		lp.password().sendKeys(password);
		lp.loginbutt().click();
		log.info("successfully tested");
		
	}
	@DataProvider//Achieving parameterization
	public Object[][] getdata()
	{
		//row...how many different data types test should run 
		//column...how many values per each test
		Object[][]ob=new Object[2][2];
		//0th row ..1 type of user
		ob[0][0]="anusha";
		ob[0][1]="anuu";
		//1th row....2nd type of user
		ob[1][0]="bhavya";
		ob[1][1]="bhav";
		
		return ob;
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	
	}
	

}
