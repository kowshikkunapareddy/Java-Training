package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.List;

public class SelectDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

      //  By select = By.xpath("//select");
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();

        Select dropdown = new Select(driver.findElement(By.xpath("//select")));
        dropdown.selectByVisibleText("India");
//        dropdown.deselectAll();
//        dropdown.deselectAll();
        dropdown.selectByIndex(7);
        driver.navigate().refresh();
        dropdown = new Select(driver.findElement(By.xpath("//select")));
        Thread.sleep(5000);
        List<WebElement> Total = dropdown.getOptions();
        System.out.println("Total List"   + Total.size());
        for (WebElement element : Total) {
            System.out.println(element.getText());
            }
        driver.quit();
        }

    }
//List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
//List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
//int totalrows = rows.size()-1;//7
//int totalcolumns = columns.size();//4
//        System.out.println("total number of rows- " + totalrows);
//        System.out.println("total number of columns- " + totalcolumns);
//        for(int i = 2 ; i<=totalrows; i++){
//        for(int j=1; j<=totalcolu

