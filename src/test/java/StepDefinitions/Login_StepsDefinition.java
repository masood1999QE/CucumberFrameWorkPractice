package StepDefinitions;

import DependencyInjection.DependencyTestContext;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
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
import java.util.Objects;
import java.util.Properties;


public class Login_StepsDefinition {

	private DependencyTestContext dp;
	public Login_StepsDefinition(DependencyTestContext dp)
	{
		this.dp=dp;
	}

	private homePage hp;
	private searchItemsPage sp;
	private Properties prop;

	@After
	public void tearDown() {
		System.out.println("After All  Executed");
		//driver.quit();
	}


	@Given("User lands in the home page")
	public void user_lands_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		dp.driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
	    System.out.println("Users is in home page");
		hp=new homePage(dp.driver);

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
		sp=new searchItemsPage(dp.driver);
		Assertions.assertEquals(sp.getPageTitle(productName).contains(productName),true);

	}


	@Then("^Verify the (.+) is displayed in the page$")
	public void verify_the_productName_is_displayed_in_the_page(String productName)
	{
		System.out.println("productName:"+productName);
		Assertions.assertEquals(sp.productNameExist(productName),true);
	}

}
