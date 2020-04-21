package acadmy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resource.Base;

public class ValidateTitle extends Base {
	
	public static WebDriver driver;
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void intializer() throws IOException
	{
		driver = initializeDriver();
		//log.info("driver intailed");
		log.info("driver intializer Validate titil");
		
		driver.get("http://qaclickacademy.com");
		//driver.get(prop.getProperty("url"));
		log.info("page Navigated Validate titil");
	}
	@Test
	public void getTitel() throws IOException
	{
		
		LandingPage l = new LandingPage(driver);
		
		String Title = l.getTitle().getText();
		System.out.println(Title);
		Assert.assertEquals(Title, "FEATURED COURSES");
		log.info("success Validate titil");
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver = null;
	}
	public static void main(String[] args) throws IOException 
	{
		ValidateTitle vt = new ValidateTitle();
		vt.getTitel();
	}
	
	
	

}
