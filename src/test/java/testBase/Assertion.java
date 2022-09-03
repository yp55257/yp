package testBase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	@Test
	public void verifyName()
	{
		System.out.println("start name");
		SoftAssert a = new SoftAssert();
		a.assertEquals("Yogesh", "Yogesh P");
		System.out.println("End name");
		a.assertAll();	
		System.out.println("hiiiiii");
	}
}
