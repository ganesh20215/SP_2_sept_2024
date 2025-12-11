package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.zoho.com/people/");

        //WebElement element = driver.findElement(By.id("login1"));
        //element.sendKeys("Ganesh Jadhav");

        //clear()
        //element.clear();

        //submit()
        //WebElement e1 = driver.findElement(By.className("signin-btn"));
        //System.out.println(e1.getText());
        //System.out.println(e1.getTagName());

        System.out.println(driver.getTitle());
    }
}
