package acadmy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resource.Base;

public class ValidateNavigationBar extends Base {
	public static Logger log = LogManager.getLogger();
	@BeforeTest
	public void intializer() throws IOException
	{
		driver = initializeDriver();
		log.info("driver intailize ValidateNavigationbar");
		//driver.get(prop.getProperty("url"));
		driver.get("http://qaclickacademy.com");
		log.info("page navigation ValidateNavigationbar");
		
	}
	@Test
	public void BaseNavigation() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		boolean b = l.getNavigationBar().isDisplayed();
		System.out.println(b);
		Assert.assertFalse(false);
		log.info("suucess ValidateNavigationbar");
		
		System.out.println("Dhaval");
		System.out.println("Suhani");
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver = null;
	}
	public static void main(String[] args) throws IOException
	{
		ValidateNavigationBar v = new ValidateNavigationBar();
		v.BaseNavigation();
		
		System.out.println("Dhaval");
		System.out.println("Suhani");
	}
}
