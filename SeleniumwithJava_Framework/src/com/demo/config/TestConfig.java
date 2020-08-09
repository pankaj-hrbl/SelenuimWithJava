package com.demo.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestConfig {

	public WebDriver driver;

	@BeforeMethod
	public void Initialization() {
		
		//Pass the Path of your home Directory
		System.setProperty("webdriver.chrome.driver",
				"your_directoryPath\\SeleniumwithJava_Framework\\BrowserExe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://aws-demo.shopizer.com:8080/shop/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void TearDown() {
		driver.close();
		driver.quit();
	}

}
