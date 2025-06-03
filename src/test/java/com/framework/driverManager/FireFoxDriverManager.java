package com.framework.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverManager implements BrowserDriver{

	@Override
	public WebDriver createWebDriver() {
		// TODO Auto-generated method stub
		return new FirefoxDriver();
	}

}
