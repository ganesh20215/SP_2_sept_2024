package selenium.actionsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.flipkart.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Login']"));

        Actions a = new Actions(driver);
        a.moveToElement(element)
                .perform();
    }
}
