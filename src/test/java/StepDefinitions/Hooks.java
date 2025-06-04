package StepDefinitions;

import DependencyInjection.DependencyTestContext;
import com.framework.driverManager.DriverFactory;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks {


    public DependencyTestContext dp;
    public Hooks(DependencyTestContext dp)
    {
        this.dp=dp;
    }

    private Properties prop;
    @Before
    public void setup() throws IOException {
        System.out.println("Before All  Executed");
        if(dp.isDriverInitialized==false)
        {
            System.out.println("Before All  Executed Inside");
            String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\environment.properties";
            System.out.println("filePath:"+ filePath);
            File file=new File(filePath);
            FileInputStream fis=new FileInputStream(file);
            prop=new Properties();
            prop.load(fis);
            String browser=prop.getProperty("browser");
            System.out.println("browser:"+browser);
            dp.driver= DriverFactory.getDriver(browser).createWebDriver();
            dp.isDriverInitialized=true;
        }
    }
	
}
