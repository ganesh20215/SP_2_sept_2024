package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.letskodeit.com/practice");

        WebElement radioBtn = driver.findElement(By.id("bmwcheck"));

        System.out.println(radioBtn.isSelected());    //false
        radioBtn.click();
        System.out.println(radioBtn.isSelected());    //true

        driver.close();
    }
}
