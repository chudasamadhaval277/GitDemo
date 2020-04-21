package resource;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.*;
import org.apache.commons.io.FileUtils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sagar\\eclipse-workspace\\project22\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("chrome"))
		{
			System.out.println("1111");
			System.setProperty("webdriver.chrome.driver", "F:\\Driver for selenium java\\chromedriver_win32 (3)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("FireFox"))
		{
			System.out.println("2222");
			System.setProperty("webdriver.gecko.driver", "F:\\Driver for selenium java\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equals("IE"))
		{
			System.out.println("3333");
			System.setProperty("webdriver.ie.driver", "F:\\Driver for selenium java\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		return driver;
		
	}
	public void getScreenshot(String results) throws IOException
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Sagar\\eclipse-workspace\\project22\\"+results+"screenshot.png"));
	}
	public static void main(String[] args) throws IOException
	{
		Base b = new Base();
		b.initializeDriver();
	}
	
}
