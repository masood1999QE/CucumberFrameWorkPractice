package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Wait;

public class searchItemsPage {


	private WebDriver driver;
    private Wait wait;
	public By productTitleHeaderEle;
	 public searchItemsPage(WebDriver driver)
	 {
		 this.driver=driver;
		 wait=new Wait(driver);
	 }

	 public String getPageTitle(String productName)
	 {
		 wait.waitForPageTitle(productName);
		 return driver.getTitle();
	 }

	 public boolean productNameExist(String productName)
	 {
		 String xpathString="//div[@id='product-search']  //h1[contains(text(),"+"'"+productName+"')]";
		 System.out.println("xpathString:"+xpathString);
		 productTitleHeaderEle= By.xpath(xpathString);
		 wait.waitForElement(productTitleHeaderEle);
		 String currentProductName=driver.findElement(productTitleHeaderEle).getText();
		 if(currentProductName.contains(productName))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }

}
