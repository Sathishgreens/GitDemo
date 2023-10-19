package org.pages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@data-testid='royal_login_button']")
	private WebElement loginButton;
	
	@FindBy(linkText="Forgotten password?")
	private WebElement forgotPassword;
	
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
	private WebElement createNewButton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}
	
	public WebElement getcreateNewButton() {
		return createNewButton;
	}
}
