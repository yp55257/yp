package testBase;

import org.apache.commons.collections4.FactoryUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashbordPage;
import pages.LoginPage;
import utility.ScreenShot;

public class DashbordPageTest extends TestBase {
	
	DashbordPage dash;
	LoginPage login;
	
	@BeforeMethod (groups = {"Sanity", "Regration"}, enabled = true)
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
		dash = new DashbordPage();
		login.loginZerodhaApp();
	}
	
	@Test(/*priority = 5,*/ enabled = true)
	public void verifyNicknameTest() throws Exception
	{
		String value = dash.verifyNickname();
		String exp = "Yogeshp";
		Assert.assertEquals(value, exp);
	}
	
	@Test(/*dependsOnMethods = "verifyNicknameTest",*/ priority = 0, invocationCount= 1, enabled = false )
	public void verifyViewstatmentlinkTest() throws Exception
	{
	
		String exp = dash.verifyUseridLink();
		System.out.println(exp);
	}
	
	@Test(priority = 4, enabled = true)
	public void verifyEmaliTest() throws Exception
	{
		String exp = "yp552577@gmail.com";
		String value1 = dash.verifyEmali();
		Assert.assertEquals(value1, exp);
//		Assert.assertEquals(value1, exp);
//		Assert.assertTrue(false);
//		Assert.assertTrue(false, "all is well");
		System.out.println(value1);
	}
	
	@Test(/*priority = 3, enabled = false*/ groups = "Regration", enabled = false)
	public void VerifyMyprofileTest() throws Exception
	{
		String exp = dash.VerifyMyprofile();
		System.out.println(exp);
	}
	
	@Test(/*priority = 2,enabled = true, */groups = {"Sanity", "Regration"}, enabled = false)
	public void verifyConsol() throws Exception
	{
		String exp = dash.verifyConsol();
		System.out.println(exp);
	}
	
	@Test(/*priority = 1, invocationCount = 2, timeOut = 5*/ groups = "Sanity", enabled = false)
	public void verifyUseridalltextTest() throws Exception
	{
		String exp = dash.verifyUseridalltext();
		System.out.println(exp);
	}
	
	
		@Test(enabled = false)
	
	public void verifyByTataSteelSharesTest() throws Exception
	{
		dash.verifyByTataSteelShares();
	}
	
	
	@AfterMethod (groups = {"Sanity", "Regration"})
	public void exit(ITestResult z) throws Exception
	{
		if(ITestResult.FAILURE==z.getStatus())
		{
			ScreenShot.takeScreenShotMethod(driver, z.getName());
		}
		driver.close();
	}
	
	

	
	
	
	
	
	

}
