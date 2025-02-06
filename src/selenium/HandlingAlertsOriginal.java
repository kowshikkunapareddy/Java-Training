package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class HandlingAlertsOriginal {

    public static void main(String[] args) throws InterruptedException {


            WebDriver driver = new ChromeDriver();

            By okButton = By.xpath("//*[text()=\"Alert with OK \"]");
            By clickTheButton = By.xpath("//div//button[@class = \"btn btn-danger\"]");
            By click2 = By.xpath("//div//button[@class = \"btn btn-primary\"]");
            By alertWithOk = By.xpath("//*[text()=\"Alert with OK & Cancel \"]");
            By alertWithText = By.xpath("//*[text() = \"Alert with Textbox \"]");
            By click3 = By.xpath("//div//button[@class = \"btn btn-info\"]");

            driver.get("https://demo.automationtesting.in/Alerts.html");
            driver.manage().window().maximize();

            //Click 1
            driver.findElement(okButton).click();
            driver.findElement(clickTheButton).click();
            Alert alert = driver.switchTo().alert();
            alert.accept();


//             Click 2
//            driver.findElement(alertWithOk).click();

        for (int i = 0; i < 2; i++) {
            driver.findElement(alertWithOk).click(); // Click on the alert
            Thread.sleep(1000);
            driver.findElement(click2).click(); // Click the button to trigger the alert

            // Handle the alert based on the loop iteration
            if (i == 0) {
                alert.accept(); // Accept the alert on the first iteration
            } else if (i == 1) {
                alert.dismiss(); // Dismiss the alert on the second iteration
            }

            Thread.sleep(1000); // Wait before the next iteration
        }
//            Thread.sleep(1000);
//            driver.findElement(click2).click();
//            alert.accept();
//
//             Thread.sleep(1000);
//            driver.findElement(alertWithOk).click();
//            driver.findElement(click2).click();
//            alert.dismiss();
//            Thread.sleep(1000);

            //Click 3
//            driver.findElement(alertWithText).click();
//            driver.findElement(click3).click();
//            alert.sendKeys("Handling Alerts");
//            alert.accept();
//            Thread.sleep(5000);
//            driver.findElement(alertWithText).click();
//            driver.findElement(click3).click();
//            alert.sendKeys("Handling Alerts");
//            alert.dismiss();
//            Thread.sleep(5000);
//            driver.quit();

        for (int i = 0; i < 2; i++) {
            driver.findElement(alertWithText).click(); // Click to open alert with textbox
            Thread.sleep(1000);
            driver.findElement(click3).click(); // Trigger the alert
            alert.sendKeys("Handling Alerts"); // Send text to the alert

            // Handle the alert based on the loop iteration
            if (i == 0) {
                alert.accept(); // Accept the alert on the first iteration
            } else if (i == 1) {
                alert.dismiss(); // Dismiss the alert on the second iteration
            }

            Thread.sleep(5000); //// Wait before the next interaction

        }
        driver.quit();
        }
    }

