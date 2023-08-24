package com.Swaglab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPo 
{
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement Username ;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement Password;
	@FindBy(xpath="//input[@type='submit']")private WebElement LoginButton;
	@FindBy(xpath="//h3[contains(text(),'Epic')]")private WebElement ErrorMessage;



	public LoginPo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void EnterCredentials() 
	{
		Username.clear();		
		Username.sendKeys("standard_user");
		Password.clear();
		Password.sendKeys("secret_sauce");
	}
	public void ClickONLoginButton() 
	{
		LoginButton.click();
	}
	public void EnterInvalidCredentials() 
	{
		Username.sendKeys("standard_use");
		Password.sendKeys("secret_sauce");
	}
	public String IsErrorMessageDisplayed() 
	{
	    return ErrorMessage.getText();
	}

}
