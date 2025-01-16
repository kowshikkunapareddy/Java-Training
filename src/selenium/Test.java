package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        By contactUs = By.xpath("//a//span[@class='contact__link-container__label']");
        By searchTab = By.xpath("//form[@class='search search-full']"); // This selects the form
        By searchInput = By.xpath("//form[@class='search search-full']//input"); // Assuming this is the search input field

        driver.get("https://www.codashop.com/en-in/");
        driver.manage().window().maximize();

        // Click on the 'Contact Us' link to open a new tab
        driver.findElement(contactUs).click();

        // Switch to the new tab (the second window handle)
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Print the current page title
        System.out.println("Current page title: " + driver.getTitle());

        // Use WebDriverWait to ensure that the search input field is visible and clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(searchInput));

        // Click on the search input field
        searchElement.click();

        // Send text to the search input field
        searchElement.sendKeys("Come Back to India");

        // Optionally, print something to verify the action
        System.out.println("Search term entered: Come Back to India");

        // Sleep for a few seconds to observe the actions (optional)
        Thread.sleep(3000);

        // Close the driver
        driver.quit();
    }
}
