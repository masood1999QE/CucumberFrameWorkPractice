package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

	
	private WebDriver driver;
	
	 public homePage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 private By searchBar=By.cssSelector("div[id='main-header'] input[type='text'][placeholder*='Search For Products']");
	private By searchBtn=By.cssSelector("div[id='main-header'] button[type='submit']");

	 public void enterProductName(String productName)
	 {
		driver.findElement(searchBar).sendKeys(productName);
	 }

	public void clickSearchBtn()
	{
		driver.findElement(searchBtn).click();
	}
}
