package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By signin = By.cssSelector("a[href*='sign_in']");
	
	By Title = By.xpath("//*[text()=\"Featured Courses\"]");
	
	By NavigationBar = By.xpath("//a[text()=\"Contact\"]");
	
	
	
	
	public WebElement getlogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(Title);
		
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavigationBar);
	}
}
