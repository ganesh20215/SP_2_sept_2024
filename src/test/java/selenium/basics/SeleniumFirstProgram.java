package selenium.basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumFirstProgram {

    public static void main(String[] args) {

        //write code for print even numebers from 1 to 10
        for(int i=1; i<=10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
