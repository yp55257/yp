package pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadExcel;

public class DashbordPage extends TestBase {
	
	//Object Repositary
			@FindBy(xpath="//input[@id='userid']") private WebElement idtextbox;
			@FindBy(xpath="//input[@id='password']") private WebElement passtextbox;
			@FindBy(xpath="//button[@type='submit']") private WebElement submitbutton;
			@FindBy(xpath="//span[@class='nickname']") private WebElement nickNameLabel;
			
			@FindBy(xpath="//span[@class='user-id']") private WebElement useridLink;
			@FindBy(xpath="//h4[@class='username']") private WebElement fullnameLable;
			@FindBy(xpath="//div[@class='email']") private WebElement emailLable;
			@FindBy(xpath="//span[@class='icon icon-user']") private WebElement myprofileLable;
			@FindBy(xpath="//span[@class='icon icon-console']") private WebElement consolLable;
			@FindBy(xpath="//div[@class='dropdown-nav layer-2']") private WebElement alluserText;
			@FindBy(xpath="//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']") private WebElement searchBox;
			@FindBy(xpath="//li[@class='search-result-item selected']") private WebElement tataSteel;
			
			
			public DashbordPage()
			{
				PageFactory.initElements(driver, this);
			}

			public String verifyNickname() throws Exception
			{
				return nickNameLabel.getText();
			}
			
			public String verifyUseridLink() throws Exception
			{
				useridLink.click();
				return fullnameLable.getText();
					
			}
			public String verifyEmali() throws InterruptedException
			{
				useridLink.click();
				return emailLable.getText();
			}
			
			public String VerifyMyprofile() throws Exception
			{
				useridLink.click();
				return myprofileLable.getText();
			}
			
			public String verifyConsol() throws Exception
			{
				useridLink.click();
				return consolLable.getText();
			}
			
			public String verifyUseridalltext() throws Exception
			{
				useridLink.click();
				return alluserText.getText();
				
			}
			
			public void verifyByTataSteelShares() throws Exception
			{
				searchBox.sendKeys(ReadExcel.readExcelFile(0, 0));
				Actions a = new Actions(driver);
				a.moveToElement(tataSteel).build().perform();
				a.click().build().perform();
			}
}
