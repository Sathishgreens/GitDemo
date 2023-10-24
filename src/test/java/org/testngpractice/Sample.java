package org.testngpractice;

import java.time.Duration;
import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Sample extends BaseClass {
	// svg tags
	@Test
	public void tc1() throws InterruptedException {
		browserLaunch("chrome");
		maximize();
		loadUrl("https://covid19.who.int/region/searo/country/in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		// Xpath ==> //*[local-name='svg' and @attribute='value']
		List<WebElement> elements = driver.findElements
				(By.xpath("(//*[local-name()='svg'])[30]//*[name()='rect']"));

		
		System.out.println(elements);
		Actions actions = new Actions(driver);
		
		System.out.println("Git Cloning");
		for (WebElement webElement : elements) {
			actions.moveToElement(webElement).perform();
			String text = driver.findElement
					(By.xpath("//div[@class='sc-AxjAm fzFgoJ']")).getText();
			System.out.println(text);
		}
	}
}
