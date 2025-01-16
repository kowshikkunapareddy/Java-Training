package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportentMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(6000);
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");
       // driver.findElement(By.name("twotabsearchtextbox")).sendKeys("macbook");
        driver.findElement(By.id("nav-search-submit-button")).click();

   //     Thread.sleep(6000);
     //   driver.findElement(By.className("btn")).click();
    //    driver.navigate().back();
     //   driver.navigate().refresh();
     //   Thread.sleep(6000);
      //  driver.navigate().forward();
     //  // driver.findElement(By.cssSelector("div.product-thumb")).click();
      //  driver.findElement(By.className("fa-solid fa-shopping-cart")).click();


    }
}

