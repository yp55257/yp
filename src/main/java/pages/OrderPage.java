package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class OrderPage extends TestBase{
	//object repository
	@FindBy(xpath="//a[@class='orders-nav-item']") private WebElement orderButton;
	@FindBy(xpath="//img[@class='empty-img']") private WebElement bookImage;
	@FindBy(xpath="//button[@class='button-blue']") private WebElement getstartedButton;
	@FindBy(xpath="//button[@class='button-outline']") private WebElement closeWindowButton;
	@FindBy(xpath="//a[@target='_blank']") private WebElement historyButton;
	
	
	public OrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyByOrder()
	{
		orderButton.click();
		getstartedButton.click();
		
		closeWindowButton.click();		
	}
	
	public String verifyGetstartedText() 
	{
		orderButton.click();
		return getstartedButton.getText();		
	}
	
	public void verifyHistory() throws Exception
	{
		orderButton.click();
		historyButton.click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		String win[] = new String[5];
		for(int i=0; i<window.size(); i++)
		{
			win[i] = it.next();
		}
		
		driver.switchTo().window(win[1]);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(win[0]);
	}
	
	
}
