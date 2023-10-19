package org.testcases;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.LoginPage;

public class TestCaseOne extends BaseClass {
	
	public static void main(String[] args) {

		//set the property of browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\eclipse-workspace\\SeleneiumWeekend\\Drivers\\chromedriver.exe");
		
		//Initialize the WebDriver
		browserLaunch("chrome");
		//driver.manage().window().maximize();
		//load a url
		driver.get("http://watir.com/examples/shadow_dom.html");	
		
		//Find the WebElement of ShadowHost
		WebElement shadowHost = driver.findElement(By.xpath("//div[@id='shadow_host']"));
		
		//Find the WebElement of ShadowRoot
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		Object executeScript = executor.executeScript("return arguments[0].shadowRoot", shadowHost);
		SearchContext w = (SearchContext) executeScript;
		//Find the WebElement of Desired
		WebElement textElement = w.findElement(By.className("info"));
		String text = textElement.getText();
		System.out.println(text);
	}
}
