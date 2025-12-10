package selenium.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.letskodeit.com/practice");


        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("Good Evening..");
        driver.findElement(By.id("confirmbtn")).click();

        Alert a = driver.switchTo().alert();
        //a.accept();
        System.out.println(a.getText());
        a.dismiss();

        driver.findElement(By.id("bmwcheck")).click();
    }
}
