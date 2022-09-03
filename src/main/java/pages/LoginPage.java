package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadProperties;

public class LoginPage extends TestBase {

	
	//Object Repositary
		@FindBy(xpath="//input[@id='userid']") private WebElement idtextbox;
		@FindBy(xpath="//input[@id='password']") private WebElement passtextbox;
		@FindBy(xpath="//button[@type='submit']") private WebElement submitbutton;
		@FindBy(xpath="//img[@alt='Kite']") private WebElement kiteLogo;
		@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zeodhaLogo;
		@FindBy(xpath="//input[@id='pin']") private WebElement pinTextBox;
		@FindBy(xpath="//button[@type='submit']") private WebElement continueButton;
		
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String verifyTitle()
		{
			return driver.getTitle();
		}
		
		public boolean verifyKiteLogo()
		{
			return kiteLogo.isDisplayed();
		}
		
		public void loginZerodhaApp() throws Exception
		{
			idtextbox.sendKeys(ReadProperties.readPropertyFile("userid"));
			passtextbox.sendKeys(ReadProperties.readPropertyFile("password"));
			submitbutton.click();
			pinTextBox.sendKeys(ReadProperties.readPropertyFile("pin"));
			continueButton.click();
		}
		
}
