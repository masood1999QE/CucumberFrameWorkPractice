package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {

    private WebDriver driver;
    private WebDriverWait wait;

    public Wait(WebDriver driver)
    {
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(8000));
    }

    public void waitForPageTitle(String titleName)
    {
        wait.until(ExpectedConditions.titleContains(titleName));
    }

    public void waitForElement(By locator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
