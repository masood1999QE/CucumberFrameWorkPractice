package StepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.framework.driverManager.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.loginPage;

public class Hooks {

	
	private WebDriver driver;
	
    private loginPage lp;
    private Properties prop;
	
	@Before
	public void setup() throws IOException {
		String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\environment.properties";
		System.out.println("filePath:"+ filePath);
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		String browser=prop.getProperty("browser");
		System.out.println("browser:"+browser);
		driver=DriverFactory.getDriver(browser).createWebDriver();
		lp=new loginPage(driver);
		
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	
}
