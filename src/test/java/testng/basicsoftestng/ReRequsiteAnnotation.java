package testng.basicsoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReRequsiteAnnotation {

    public static  WebDriver driver;

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();  //Upcasting
    }

    @Test
    public void verifyEdsoServices(){
        driver.get("https://www.edso.in");
    }

    @Test
    public void verifyTCS(){
        driver.get("https://www.tcs.com");
    }
}
