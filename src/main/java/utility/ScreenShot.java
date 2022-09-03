package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void takeScreenShotMethod(WebDriver driver, String methodName ) throws Exception
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\LENOVO\\eclipse-workspace\\framework\\ScreenShot\\"+methodName+".png");
		FileHandler.copy(source, dest);
	}
}
