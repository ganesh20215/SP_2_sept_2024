package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization {

    public static WebDriver driver;

    @Parameters("browserName")
    @BeforeMethod
    public void settingUp(String browserName) {
        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();  //Upcasting
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please select correct browser name");
        }

        driver.get("https://www.saucedemo.com/");
    }

    @Parameters({"userName", "password"})
    @Test
    public void verifyNeedOfParameterization(String userName, String password) {
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        //driver.close();
    }
}
