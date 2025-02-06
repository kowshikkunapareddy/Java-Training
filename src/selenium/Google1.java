package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Google1 {
        public static void main(String[] args) throws InterruptedException {

            // Set up WebDriver and open Google
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.co.in/");

            // Type "Selenium" into the search box
            driver.findElement(By.xpath("//div//textarea[@class='gLFyf']")).sendKeys("Selenium");

            // Wait for the search results to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement searchButton = driver.findElement(By.name("btnK"));
            searchButton.click();  // Click the "Google Search" button

            // Wait for the search results page to load
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));

            // Locate the first search result and click on it (which will likely be the official Selenium website)
            WebElement firstResult = driver.findElement(By.xpath("//h3[contains(text(), 'Selenium')]"));
            firstResult.click();

            // Optionally, wait for the page to load after the click
            Thread.sleep(3000);

            // Close the browser
            driver.quit();
        }
    }

