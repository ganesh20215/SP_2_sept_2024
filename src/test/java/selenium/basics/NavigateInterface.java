package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateInterface {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().refresh();
    }
}
