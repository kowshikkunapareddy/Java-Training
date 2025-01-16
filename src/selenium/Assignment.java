package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        By contactUs = By.xpath("//a//span[@class='contact__link-container__label']");
        By searchTab = By.xpath("//form[@class=\"search search-full\"]//input[2]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.codashop.com/en-in/");
        driver.manage().window().maximize();

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement contactus = wait.until(ExpectedConditions.elementToBeClickable(contactUs));
        driver.findElement(contactUs).click();

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Now you are in the new tab, you can perform actions here

        System.out.println("Current page title: " + driver.getTitle());


        System.out.println(driver.getWindowHandles());


        WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(searchTab));
        searchElement.click();

        //  System.out.println("Current page title: " + driver.getTitle());
        driver.findElement(searchTab).click();
        driver.findElement(searchTab).sendKeys("Come Back to India");
        driver.close();

        driver.switchTo().window((String) allWindowHandles.toArray()[0]);

        // Perform actions on the main window
        System.out.println("Returned to main window. Current page title: " + driver.getTitle());

        // Close the browser
        driver.quit();


    }
}




