package StepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;



import com.framework.driverManager.DriverFactory;
import pages.searchItemsPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Login_StepsDefinition {

	private WebDriver driver;

	private homePage hp;
	private searchItemsPage sp;
	private Properties prop;

	@Before
	public void setup() throws IOException {
		String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\environment.properties";
		System.out.println("filePath:"+ filePath);
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");
		System.out.println("browser:"+browser);
		driver=DriverFactory.getDriver(browser).createWebDriver();
		hp=new homePage(driver);

	}

	//@After
	public void tearDown() {
		driver.quit();
	}

	@Given("User lands in the home page")
	public void user_lands_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
	    System.out.println("Users is in home page");
		hp=new homePage(driver);

	}
	@When("^User enter (.+) and Click on Search Button$")
	public void user_enter_productName_and_click_on_search_button(String productName) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("productName:"+productName);
		hp.enterProductName(productName);
		hp.clickSearchBtn();

	}

	@Then("^Verify the title of the page contains the (.+)$")
	public void application_should_navigate_to_home_page(String productName) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("productName:"+productName);
		sp=new searchItemsPage(driver);
		Assertions.assertEquals(sp.getPageTitle(productName).contains(productName),true);

	}

	@Then("^Verify the (.+) is displayed in the page$")
	public void verify_the_productName_is_displayed_in_the_page(String productName)
	{
		System.out.println("productName:"+productName);
		Assertions.assertEquals(sp.productNameExist(productName),true);
	}

}
