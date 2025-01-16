package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CodaShop {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        WebElement wb = driver.findElement(By.tagName("a"));
        List <WebElement> al= driver.findElements(By.tagName("a"));
        System.out.println(al.size());



    }
}
