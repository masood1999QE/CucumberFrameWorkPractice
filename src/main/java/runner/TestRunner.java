package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features="src/main/java/features",
		glue={"StepDefinitions"},
		tags="@SmokeTest",
		plugin={"pretty","html:target/cucumber-reports.html","json:target/cucumber-reports.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true,
		publish=true)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider	
    public Object[][] scenarios() 
	{
	
		return super.scenarios();
	}
}