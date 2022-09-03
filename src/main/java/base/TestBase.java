package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadProperties;

public class TestBase {

	
public static WebDriver driver;
	
	public void initalization() throws Exception
	{
		String browserValue = ReadProperties.readPropertyFile("browser");
		
		if(browserValue.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		else if(browserValue.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(ReadProperties.readPropertyFile("url"));
	}
	
	
	
}
