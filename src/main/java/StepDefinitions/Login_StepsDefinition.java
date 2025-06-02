package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

import org.testng.Assert;

import com.framework.driverManager.DriverFactory;


public class Login_StepsDefinition {
	
	private WebDriver driver;
	
	private loginPage lp;
	
	
	@Given("User launch the url")
	public void User_launch_the_url()
	{
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
	}
	
	@When("Click On Login Button")
	public void  Click_On_Login_Button()
	{
		lp.clickOnLoginBtn();
	}
	
	@Then("Application should navigate to Login page")
	public void Application_should_navigate_to_Login_page()
	{
		 
		String loginText=lp.getLoginText();
		Assert.assertEquals(loginText.trim().contains("login"),true);
	}
	
	@Given("User in login page")
	public void user_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Users is in login page");
	}
	@When("User enter {string} and {string} On Login Page")
	public void user_enter_and_on_login_page(String userName, String passWord) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Users name:"+userName);
		System.out.println("Password:"+passWord);
	}
	@When("User click on login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User click on login button");
	}
	@Then("Application should navigate to Home page")
	public void application_should_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Application should navigate to Home page");
	}


}
