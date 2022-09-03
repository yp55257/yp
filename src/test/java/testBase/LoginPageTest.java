package testBase;

import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase {

	

	LoginPage login = new LoginPage();
	
	@Test
	public void test1() throws Exception
	{
		initalization();
		System.out.println("open");
		driver.close();
	}
	
	@Test
	public void test2() throws Exception
	{
		initalization();
		String actTitle = login.verifyTitle();
		String expTtile = "Kite - Zerodha's fast and elegant flagship trading platform";
		System.out.println(actTitle);
		driver.close();
	}
	
	
	
}
