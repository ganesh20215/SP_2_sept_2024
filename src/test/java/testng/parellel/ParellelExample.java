package testng.parellel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelExample {

    @Test
    public void t1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.close();
    }

    @Test
    public void t2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in/");
    }

    @Test
    public void t3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.peoplenexusai.com/");
        driver.close();
    }

    @Test
    public void t4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediffmail.com/");
        driver.close();
        System.out.println("Hello Alll");
    }
}
