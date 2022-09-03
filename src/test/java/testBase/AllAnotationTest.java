package testBase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnotationTest {
	@AfterMethod
	public void method1()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void aclass2()
	{
		System.out.println("after class");
	}
	
	@AfterTest
	public void test1()
	{
		System.out.println("after test");
	}
	
	@AfterSuite
	public void suit1()
	{
		System.out.println("after suit");
	}

	@BeforeSuite
	public void suit()
	{
		System.out.println("Bfore suit");	
	}
	
	@BeforeTest
	public void test()
	{
		System.out.println("before test");
	}
	
	@BeforeClass
	public void bclass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void method()
	{
		System.out.println("before method");
	}
	
	@Test
	public void maintest()
	{
		System.out.println("test");
	}

	
	
	
	
	//Update the code 
	
	//update from github
	
}
