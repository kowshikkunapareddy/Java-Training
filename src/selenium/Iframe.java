package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        By singleIframeButton = By.xpath("//li//a[text() = \"Single Iframe \"]");
        By firstIframetext = By.xpath("//input[@type='text']");
        By multiIframeButton = By.xpath("//li//a[text() = \"Iframe with in an Iframe\"]");
        By seconIframetext = By.xpath("(//input[@type='text'])[1]");

        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(singleIframeButton).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
        driver.findElement(firstIframetext).sendKeys("hello");
        driver.switchTo().defaultContent();
        driver.findElement((multiIframeButton)).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src =\"MultipleFrames.html\"]")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src =\"SingleFrame.html\"]")));
        Thread.sleep(5000);
        driver.findElement(By.xpath(String.valueOf(seconIframetext))).sendKeys("Helloooo");

    }
}
