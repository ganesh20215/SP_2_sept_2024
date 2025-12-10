package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyHardAssert() {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.saucedemo.com/");
        Assert.assertFalse(driver.findElement(By.id("user-name")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("login-button")).isDisplayed());
        driver.close();
/*        Assert.assertTrue(true);
        System.out.println("Hello");
        Assert.assertFalse(true);
        System.out.println("Hi");
        Assert.assertTrue(true);
        System.out.println("How Are You?");*/
    }
}
