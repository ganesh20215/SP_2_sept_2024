package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        //Id Locator
        //driver.findElement(By.id("login1")).sendKeys("Ganesh");

        //class Locator
        //driver.findElement(By.className("email-input")).sendKeys("Ganesh");

        //name Locator
        //driver.findElement(By.name("login")).sendKeys("Jadhav");

        //linkText Locator
        //driver.findElement(By.linkText("Forgot password?")).click();

        //partialLinkText Locator
        //driver.findElement(By.partialLinkText("password?")).click();

        //tagName Locator
        //List<WebElement> allElements = driver.findElements(By.tagName("a"));
        //System.out.println(allElements);

        //cssSelector with Id Attribute
        //driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Ganesh");
        //driver.findElement(By.cssSelector("input#password")).sendKeys("Ganesh");

        //cssSelector with class Attribute
        //driver.findElement(By.cssSelector("input[class='email-input']")).sendKeys("Ganesh");
        //driver.findElement(By.cssSelector("input.email-input")).sendKeys("Ganesh");

        //Absolute Xpath
        //driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/div[1]/div/input")).sendKeys("Ganesh Jadhav");

        //Relative xpath
        //driver.findElement(By.xpath("//input[@class='email-input']")).sendKeys("Ganesh Jadhav");
        //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

        //xpath axes

        driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//a[text()='Bestsellers']//following::a"));
        for (WebElement e : elements) {
            if (e.getText().equalsIgnoreCase("Mobiles")) {
                Thread.sleep(2000);
                e.click();
                break;
            }
        }
    }
}
