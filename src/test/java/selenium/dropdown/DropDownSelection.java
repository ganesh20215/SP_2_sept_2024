package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownSelection {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.letskodeit.com/practice");

        WebElement dropDown = driver.findElement(By.id("carselect"));

        Select s = new Select(dropDown);

        //by selectByIndex()
        Thread.sleep(2000);
        s.selectByIndex(2);

        //By selectByValue()
        Thread.sleep(2000);
        s.selectByValue("benz");

        //By selectByVisibleText()
        Thread.sleep(2000);
        s.selectByVisibleText("BMW");

        //driver.close();
    }
}
