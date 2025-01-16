package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {


        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.opencart.com/");
            System.out.println("Page Title: " + driver.getTitle());
            Thread.sleep(6000);
            driver.manage().window().maximize();
            driver.findElement(By.name("search")).sendKeys("macbook");
            Thread.sleep(6000);
            driver.findElement(By.className("btn")).click();
          //  driver.findElement(By.className("fa-solid fa-shopping-cart")).click();
            driver.findElement(By.id("MacBook")).click();
           // driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/div/div[2]/div/h4/a")).click();
            driver.findElement(By.className("image")).click();










        }
    }
