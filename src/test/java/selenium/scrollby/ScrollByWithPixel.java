package selenium.scrollby;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByWithPixel {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;    //Down casting
        js.executeScript("window.scrollBy(0, 2500)");

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -2000)");
    }
}
