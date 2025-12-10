package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.letskodeit.com/practice");

        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        WebElement enableBtn = driver.findElement(By.id("enabled-button"));
        WebElement disableBtn = driver.findElement(By.id("disabled-button"));

        System.out.println(textBox.isEnabled());    //true
        disableBtn.click();
        System.out.println(textBox.isEnabled());    //false
        enableBtn.click();
        System.out.println(textBox.isEnabled());    //true

        driver.close();
    }
}
