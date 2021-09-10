package resources;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class baseclass {
	
	public static WebDriver driver;
	public Properties p;
	public WebDriver initilizedriver() throws IOException
	{
		
		p=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\91933\\eclipse-workspace\\E2Eproject\\src\\main\\java\\resources\\data.properties");
		p.load(file);
		String browsername=p.getProperty("browser");
		System.out.println(browsername);
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\java selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","‪D:\\java selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		return driver;
		
	}
	public void getscreenshot(String result) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;

	    File source=ts.getScreenshotAs(OutputType.FILE);    
	    FileHandler.copy(source,new File("C:\\screenshots of selenium scripts\\"+result+"screenshot1.png"));

	}

}
