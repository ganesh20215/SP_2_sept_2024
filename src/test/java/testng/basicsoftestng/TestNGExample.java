package testng.basicsoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {

    @Test(groups = "smoke")
    public void verifyEdsoServices(){
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.edso.in");
        driver.close();
    }

    @Test
    public void verifyTCS(){
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.tcs.com");
        driver.close();
    }
}
