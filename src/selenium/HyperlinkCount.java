package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HyperlinkCount {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.opencart.com/");
            WebElement wb = driver.findElement(By.cssSelector("a.dropdown"));
            List<WebElement> al= driver.findElements(By.cssSelector("a.dropdown"));
            System.out.println(al.size());

        }
    }

