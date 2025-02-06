package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Google {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
      //  driver.findElement(By.xpath("//div//textarea[@class = \"gLFyf\"]")).click();
        driver.findElement(By.xpath("//div//textarea[@class = \"gLFyf\"]")).sendKeys("Selenium");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li//span[normalize-space(.)=\"selenium\" and not(*)]\n")).click();

    }
}
