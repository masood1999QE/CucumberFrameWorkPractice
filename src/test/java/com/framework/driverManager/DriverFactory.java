package com.framework.driverManager;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	public static BrowserDriver getDriver(String browserType)
	{
		switch(browserType.toLowerCase())
		{
			case "chrome":
				return new ChromeDriverManager();
				
			case "firefox":
				return new FireFoxDriverManager();
				
			case "edge":
				return new EdgeDriverManager();
				
			default:
				throw new IllegalArgumentException("Invalid Browser Passed :"+browserType);
				
		}
		
		
	}
}
