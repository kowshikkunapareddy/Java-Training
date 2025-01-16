package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedLocations {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.codashop.com/id-id/");
        driver.manage().window().maximize();
      //  driver.findElement(By.xpath("//div[@class='header']//*[name()='svg']")).click();

        WebElement svgElement = driver.findElement(By.xpath("//div[@class='header']//*[name()='svg']"));

        if (svgElement.isDisplayed()) {
            svgElement.click();
            System.out.println("SVG element clicked.");
        } else {
            // If it's not displayed, skip it
            System.out.println("SVG element is not displayed, skipping.");
        }
            driver.findElement(By.cssSelector("img[alt='Steam Wallet Code']")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//li[1]//div[@class=\"denom-card__inner-container\"]")).click();
            driver.findElement(By.xpath("//li[@id=\"paymentChannel_26\"]")).click();
            driver.findElement(By.xpath("//div//input[@type=\"email\"]")).sendKeys("test@codapayments.com");
            driver.findElement(By.xpath("//div//button[@class=\"buyBtn  btn-default btn-single\"]")).click();
            Thread.sleep(10000);
            driver.quit();

        }
    }






