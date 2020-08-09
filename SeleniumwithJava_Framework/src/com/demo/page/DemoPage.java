package com.demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DemoPage {
	public WebDriver driver;
	
	public DemoPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SearchFunction() throws InterruptedException {
		Thread.sleep(5000);
		WebElement searchTextBox = driver.findElement(By.id("searchField"));
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		Assert.assertTrue(searchTextBox.isDisplayed(), "Search text Box is not displaying");
		searchTextBox.sendKeys("Table");
		Thread.sleep(5000);
		Assert.assertTrue(searchBtn.isDisplayed(), "Search Button is not displaying");
		searchBtn.click();

	}

}
