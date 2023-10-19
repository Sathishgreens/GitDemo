package org.testngpractice;

import java.time.Duration;

import org.baseclass.BaseClass;
import org.pages.AdactinLogin;
import org.pages.AdactinPageManager;
import org.testng.annotations.Test;

public class TestSample extends BaseClass{
	@Test()
	private void tc2() {
		browserLaunch("edge");
		maximize();
		loadUrl("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		AdactinPageManager manager = new AdactinPageManager();
		AdactinLogin adactinLogin = manager.getAdactinLogin();
		passValues(adactinLogin.getUserName(), "hsjud");
		passValues(adactinLogin.getPassword(), "1234");
		elementClick(adactinLogin.getLoginButton());	
		
		
	}
}
