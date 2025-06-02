package com.framework.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager implements BrowserDriver{

	@Override
	public WebDriver createWebDriver() {
		// TODO Auto-generated method stub
		return new EdgeDriver();
	}
	
	
}
