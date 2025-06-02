package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	
	private WebDriver driver;
	
	 public loginPage (WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 private By loginBtn=By.xpath("//div[contains(@class,'navbar-right')]//a[contains(text(),'Login')]");
	 private By loginTextEle=By.xpath("//h1[contains(text(),'Log in')]");
	 
	 public void clickOnLoginBtn()
	 {
		 driver.findElement(loginBtn).click();
	 }
	 
	 public String getLoginText()
	 {
		 //driver.findElement(loginTextEle).getText();
		 return driver.getCurrentUrl();
	 }
	 
}
