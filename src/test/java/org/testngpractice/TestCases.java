package org.testngpractice;

import java.time.Duration;

import org.baseclass.BaseClass;
import org.openqa.selenium.SearchContext;
import org.pages.AdactinLogin;
import org.pages.AdactinPageManager;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCases extends BaseClass{
	
	@Test()
	private void tc1() {
		browserLaunch("firefox");
		maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loadUrl("https://adactinhotelapp.com/");
		AdactinPageManager manager = new AdactinPageManager();
		AdactinLogin adactinLogin = manager.getAdactinLogin();
		passValues(adactinLogin.getUserName(), "12345");
		passValues(adactinLogin.getPassword(), "747467");
		elementClick(adactinLogin.getLoginButton());	
		
	}
	
	
}




