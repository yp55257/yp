package testBase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import pages.OrderPage;

public class OrderPageTest extends TestBase {
	
	LoginPage log ;
	OrderPage o;
	@BeforeMethod
	public void setup() throws Exception
	{
		
		initalization();
		log = new LoginPage();
		log.loginZerodhaApp();
		o = new OrderPage();
	}

	@Test (enabled = true)
	public void verifyByOrderTest() throws Exception
	{
			o.verifyByOrder();
			Reporter.log("Order will sucsesfull");
	}
	
	@Test (enabled = true)
	public void verifyGetstartedText()
	{
		String act = o.verifyGetstartedText();
		String exp = "Get started";
		System.out.println(act);
		Assert.assertEquals(act, exp);
		Reporter.log("Text will correct");
	}
	
	@Test
	public void verifyHistoryTest() throws Exception
	{
		o.verifyHistory();
		Reporter.log("tab was closed");
	}
	
	@AfterMethod
	public void exit() throws Exception
	{
		driver.close();
	}
}
