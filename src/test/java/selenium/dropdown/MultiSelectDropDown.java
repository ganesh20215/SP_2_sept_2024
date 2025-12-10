package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.letskodeit.com/practice");

        WebElement multiDropDown = driver.findElement(By.id("multiple-select-example"));

        Select s = new Select(multiDropDown);

        //by selectByIndex()
        Thread.sleep(2000);
        s.selectByIndex(2);

        //By selectByValue()
        Thread.sleep(2000);
        s.selectByValue("orange");

        //By selectByVisibleText()
        Thread.sleep(2000);
        s.selectByVisibleText("Apple");

/*        //by deselectByIndex()
        Thread.sleep(2000);
        s.deselectByIndex(2);

        //By deselectByValue()
        Thread.sleep(2000);
        s.deselectByValue("orange");

        //By deselectByVisibleText()
        Thread.sleep(2000);
        s.deselectByVisibleText("Apple");*/

        //by deselectAllOption()
        Thread.sleep(2000);
        s.deselectAll();
    }
}
