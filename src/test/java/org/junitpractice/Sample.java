package org.junitpractice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pages.LoginPage;
//Execution Flow of JUnit Annotations
public class Sample extends BaseClass {
	static LoginPage loginPage;
	@BeforeClass
	public static void tc5() {
		browserLaunch("chrome");
		maximize();
		
	}
	@AfterClass
	public static void tc3() {
		quit();
	}
	@Before
	public void tc1() {
		loadUrl("https://www.facebook.com/");
		loginPage = new LoginPage();
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYY HH:MM:SS");
		String format = dateFormat.format(date);
		System.out.println(format);
	}
	@After
	public void tc4() throws IOException {
		screnshot(new File("C:\\Users\\Lenovo\\eclipse-workspace"
				+ "\\Maven9am\\target\\screenshot.png"));
	}
	@Ignore
	@Test
	public void tc2() {
		passValues(loginPage.getUserName(), "Sathish");
		passValues(loginPage.getPassword(), "1234");
		elementClick(loginPage.getLoginButton());
	}
	
	@Test(timeout=500)
	public void tc6() throws IOException {
		WebElement forgotPassword = loginPage.getForgotPassword();
		elementClick(forgotPassword);
		screnshot(new File("C:\\Users\\Lenovo\\eclipse-workspace"
				+ "\\Maven9am\\target\\screenshot.png"));
	}
	
}
