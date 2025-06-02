package com.framework.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager implements BrowserDriver{

	@Override
	public WebDriver createWebDriver() {
		// TODO Auto-generated method stub
		return new ChromeDriver();
	}

	
}
