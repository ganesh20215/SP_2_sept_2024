package selenium.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://the-internet.herokuapp.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("D:\\DataProvider.xlsx");

        driver.findElement(By.id("file-submit")).click();

        WebElement fileUploadedMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

        System.out.println(fileUploadedMessage.isDisplayed());
    }
}
