package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage{
	
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By EmailId = By.id("user_email");
	By Password = By.id("user_password");
	By log_In = By.xpath("//input[@value=\"Log In\"]");
	
	public WebElement Emailid()
	{
		return driver.findElement(EmailId);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);	
	}
	public WebElement log_in()
	{
		return driver.findElement(log_In);
	}
	
	

}
