package com.demo.tests;

import org.testng.annotations.Test;

import com.demo.config.TestConfig;
import com.demo.page.DemoPage;

public class DemoTest extends TestConfig{
	
	
	@Test
	public void DemoTest_1() throws InterruptedException
	{
		System.out.println("1st Test");
		DemoPage page = new DemoPage(driver);
		page.SearchFunction();
	}

}
