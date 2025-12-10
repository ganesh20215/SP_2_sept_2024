package selenium.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ExampleOfWindowHandle {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.letskodeit.com/practice");

        driver.findElement(By.id("openwindow")).click();

        String demo = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String s : allWindows) {
            if (!s.contentEquals(demo)) {
                driver.switchTo().window(s);
                driver.findElement(By.linkText("INTERVIEW")).click();
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(demo);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
