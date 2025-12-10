package selenium.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetAllCookies {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting
        driver.get("https://www.tcs.com/");

        Cookie ac = new Cookie("Name", "Edso Services");
        driver.manage().addCookie(ac);

        System.out.println("-----------------Before delete cookies-------------");
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies) {
            System.out.println(c);
        }

        //driver.manage().deleteCookieNamed("Name");
        driver.manage().deleteAllCookies();

        System.out.println();
        System.out.println("-----------------After delete cookies-------------");
        Set<Cookie> ack = driver.manage().getCookies();
        for (Cookie c : ack) {
            System.out.println(c);
        }
        driver.close();
    }
}
