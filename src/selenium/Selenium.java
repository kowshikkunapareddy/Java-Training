package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            System.out.println("Page Title: " + driver.getTitle());
            driver.manage().window().maximize();
            Dimension dimension = new Dimension(1027,600);
            Thread.sleep(1000);
            driver.quit();

            WebDriver ff = new FirefoxDriver();
            ff.get("https://www.firefox.com");
            System.out.println("Second Webpage" + ff.getTitle());
            ff.quit();
        }
    }

