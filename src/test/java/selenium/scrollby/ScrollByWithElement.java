package selenium.scrollby;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByWithElement {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        Thread.sleep(2000);

        WebElement desElement = driver.findElement(By.xpath("//a[text()='Disclaimer']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;    //Down casting
        js.executeScript("arguments[0].scrollIntoView();", desElement);

        //Thread.sleep(2000);
        //js.executeScript("window.scrollBy(0, -2000)");
    }
}
