package step_Defination;


import cucumber.api.java.en.Given;




import cucumber.api.java.en.When;

import cucumber.api.java.en.And;
import pageobject.Landingpage;
import pageobject.loginpage;
import resources.baseclass;

import org.openqa.selenium.Dimension;



public class StepDefination extends baseclass{

    @Given("^Intilize the browser with chrome$")
    public void intilize_the_browser_with_chrome() throws Throwable {
    	
    	driver=initilizedriver();
		/*
		 * Dimension dimension=new Dimension(100, 100);
		 * driver.manage().window().setSize(dimension);
		 */
         
    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
    	loginpage lp=new loginpage(driver);
		lp.emailaddress().sendKeys(strArg1);
		lp.password().sendKeys(strArg2);
		lp.loginbutt().click();
       
    }

   

	
	 @And("^Navigate to \"([^\"]*)\" site$") 
	 public void navigate_to_something_site(String strArg1) throws Throwable 
	 {
	 driver.get(strArg1); 
	 }
	 

    @And("^Click on Login link to land on the secure signin page$")
    public void click_on_login_link_to_land_on_the_secure_signin_page() throws Throwable {
    	Landingpage l=new Landingpage(driver);
		l.login().click();
        
    }
    @And("^close browesers$")
    public void close_browesers() throws Throwable {

		driver.close();
		driver=null;
    }

}