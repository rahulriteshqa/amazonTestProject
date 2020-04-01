package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InstagramHomePage {

	WebDriver driver;
	
	
	
	@FindBy(linkText="Log In")
	WebElement LoginLink;     // first approach 
	
	@FindBy(how=How.LINK_TEXT, using="Log In")
	WebElement LoginLink2;  //second approach
	
	
	@FindBy(xpath="//input[contains(@name, 'username')]")
	private WebElement Username;
	
	@FindBy(xpath="//input[contains(@name, 'password')]")
	private WebElement Password;
	
	@FindBy(xpath="//button[contains(@type, 'submit')]")
	private WebElement LogInButton;
	
	// we need to write the methods for the actions to be performed on the above elements
	
	public void clickOnLoginLink()
	{
		LoginLink.click();
	}
	
	public void typeUsername(String EmailAddress)
	{
		Username.sendKeys(EmailAddress);
	}
	
	
	public void typePassword(String PasswordText)
	{
		Password.sendKeys(PasswordText);
	}
	
	public void clickOnSignInButton()
	{
		LogInButton.click();
	}
	
	
	// We need to get the driver instance from the main class to this class so we will create a constructor of this class so
	// whenever we create object of this class constructor will be executed
	
	public InstagramHomePage(WebDriver driverFromPreviousClass)
	{
		driver = driverFromPreviousClass;
		
		// in pagefactory approach we need to initialize these webElements
		
		PageFactory.initElements(driverFromPreviousClass, this);
	}
	
}
