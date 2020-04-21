package acadmy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resource.Base;

public class HomePage extends Base  {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName()); 
	
	@BeforeTest
	public void intializer() throws IOException
	{
		driver = initializeDriver();
		log.info("driver intailize Home page");
		System.out.println("Dhaval");
		System.out.println("Suhani");
	}
	@Test(dataProvider="getData")
	//public void basePageNavigation() throws IOException, InterruptedException
	public void basePageNavigation(String Username , String Password) throws IOException, InterruptedException
	{
		
		//driver.get(prop.getProperty("url"));
		driver.get("http://qaclickacademy.com");
		log.info("page navigation Home page");
		
		LandingPage l = new LandingPage(driver);
		l.getlogin().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.Emailid().sendKeys(Username);
		lp.Password().sendKeys(Password);
		lp.log_in().click();
		
		System.out.println("Dhaval");
		System.out.println("Suhani");
		
		log.info("Success111 Home page");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "chudasamadhaval277@gmail.com";
		data[0][1] = "dhaval27";
		
		data[1][0] = "chudasamasuhani277@gmail.com";
		data[1][1] = "suhani27";
		
		data[2][0] = "chudasamadhaval27@gmail.com";
		data[2][1] = "dhaval27";
		
		return data;
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver = null;
	}
	

}


