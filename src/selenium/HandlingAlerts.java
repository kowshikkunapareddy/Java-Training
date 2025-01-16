package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // URL to open
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();

        // Array of alert elements and corresponding buttons to click
        String[] alertTypes = {
                "Alert with OK ",
                "Alert with OK & Cancel ",
                "Alert with Textbox "
        };

        By[] buttons = {
                By.xpath("//div//button[@class='btn btn-danger']"),  // Alert with OK
                By.xpath("//div//button[@class='btn btn-primary']"), // Alert with OK & Cancel
                By.xpath("//div//button[@class='btn btn-info']")     // Alert with Textbox
        };

        // Loop through each alert type
        for (int i = 0; i < alertTypes.length; i++) {
            // Click on the alert type to trigger the alert
            driver.findElement(By.xpath("//*[text()='" + alertTypes[i] + "']")).click();
            Thread.sleep(1000);

            // Click the corresponding button
            driver.findElement(buttons[i]).click();
            Alert alert = driver.switchTo().alert();

            // Handle the alert based on its type
            if (i == 0) {
                alert.accept(); // For Alert with OK, click OK
            } else if (i == 1) {
                alert.dismiss();// For Alert with OK & Cancel, click Cancel
            } else if (i == 2) {
                alert.sendKeys("Handling Alerts"); // For Alert with Textbox, send keys
                alert.accept();
            }

            Thread.sleep(1000); // Sleep for a short time before moving to the next step
        }

        // Optionally handle a second interaction for "Alert with Textbox"
        driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//div//button[@class='btn btn-info']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Handling Alerts");
        alert.dismiss(); // Dismiss the second "Alert with Textbox"
        Thread.sleep(5000);

        // Quit the driver
        driver.quit();
    }
}
