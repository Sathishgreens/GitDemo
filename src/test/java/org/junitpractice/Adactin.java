package org.junitpractice;

import java.time.Duration;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pages.AdactinLogin;
import org.pages.AdactinPageManager;
import org.pages.AdactinSearchHotel;


public class Adactin extends BaseClass{
	AdactinLogin adactinLogin;
	AdactinSearchHotel searchHotel;
	static AdactinPageManager manager;
	@BeforeClass
	public static void initialSetUp() {
		
		browserLaunch("chrome");
		maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loadUrl("https://adactinhotelapp.com/");
		manager = new AdactinPageManager();
	}
	
	@Test
	public void tc1() throws InterruptedException {
		adactinLogin = manager.getAdactinLogin();
		String title = title();
		//Assert.assertEquals("Adactin.com - Hotel Reservation System", title);
		passValues(adactinLogin.getUserName(), "sathishgreens123");
		passValues(adactinLogin.getPassword(), "Greens@123");
		elementClick(adactinLogin.getLoginButton());
		//Thread.sleep(10000);
		
		
	}
	
	@Test
	public void tc2() {
		searchHotel=manager.getAdactinSearchHotel();
		WebElement user = searchHotel.getUser();
		String actual = attribute(user, "value");
		Assert.assertEquals("Hello sathishgreens123", actual);
		dropDown(searchHotel.getLocation(), "index", 2);
		dropDown(searchHotel.getHotel(), "index", 1);
		
	}

}
