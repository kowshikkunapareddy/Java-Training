package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

//        By red = By.xpath("//input[@value = \"red\"]");
//        By yellow = By.xpath("//input[@value = \"yellow\"]");
//        By blue = By.xpath("//input[@value = \"blue\"]");
//        By orange = By.xpath("//input[@value = \"orange\"]");
//        By green = By.xpath("//input[@value = \"green\"]");
//        By purple = By.xpath("//input[@value = \"purple\"]");

        By buttons = By.xpath("//input[@type = \"checkbox\"]");

        driver.get("https://ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();
       // driver.findElement(buttons).click();
        List<WebElement> checkboxes = driver.findElements(buttons);

        // Loop to check all checkboxes
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }

        // Wait for a while to see the checkboxes selected
        Thread.sleep(2000);  // Wait for 2 seconds

        // Uncheck all checkboxes
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
            }
        driver.quit();
        }

    }


