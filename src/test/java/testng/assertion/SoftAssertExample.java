package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySoftAssertExample(){
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.saucedemo.com/");
        SoftAssert sf = new SoftAssert();
        sf.assertFalse(driver.findElement(By.id("user-name")).isDisplayed(), "Username textbox should display");
        sf.assertFalse(driver.findElement(By.id("password")).isDisplayed(), "password textbox should display");
        sf.assertTrue(driver.findElement(By.id("login-button")).isDisplayed(), "login button should display");
        sf.assertEquals(driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText(), "swag Labs");
        sf.assertAll();
        driver.close();

    }
}
