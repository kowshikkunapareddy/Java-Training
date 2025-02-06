package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class RadioButton1 {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();

            // Radio button locators
            By[] radioButtons = {
                    By.xpath("//input[@value = 'red']"),
                    By.xpath("//input[@value = 'yellow']"),
                    By.xpath("//input[@value = 'blue']"),
                    By.xpath("//input[@value = 'orange']"),
                    By.xpath("//input[@value = 'green']"),
                    By.xpath("//input[@value = 'purple']")
            };

            driver.get("https://ironspider.ca/forms/checkradio.htm");
            driver.manage().window().maximize();

            // Scroll down to make sure the radio buttons are visible
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");

            // Loop through the radio buttons
            for (By radioButton : radioButtons) {
                // Click to select the radio button
                driver.findElement(radioButton).click();
                Thread.sleep(500); // Sleep for 500 milliseconds to see the action

                // Uncheck the radio button using JavaScript (deselecting)
                ((JavascriptExecutor) driver).executeScript("arguments[0].checked = false;", driver.findElement(radioButton));
                Thread.sleep(500); // Sleep for 500 milliseconds to see the action
            }

            driver.quit();
        }
    }
    
