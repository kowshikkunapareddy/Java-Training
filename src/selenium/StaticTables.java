package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTables {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        int totalColumnSize = driver.findElements(By.xpath("//table[@name = \"BookTable\"]//th")).size();
        int totalRowSize = driver.findElements(By.xpath("//table[@name = \"BookTable\"]//tr")).size() - 1;
        int totalData = driver.findElements(By.xpath("//table[@name = \"BookTable\"]//td")).size();
        System.out.println("Total No.of Columns = " + totalColumnSize);
        System.out.println("Total No.of Rows = " + totalRowSize);
        System.out.println("Total No.of Rows = " + totalData);
        String value = driver.findElement(By.xpath("//table[@name = \"BookTable\"]//tr[4]//td[2]")).getText();
        System.out.println(value);

//        for (int r = 2; r <= totalRowSize + 1; r++) {
//            for (int c =1; c <= totalColumnSize; c++) ;
//            System.out.println(driver.findElement(By.xpath("//table[@name = \"BookTable\"]//tr[r]//td[c]")).getText());
//            System.out.println(driver.findElement(By.xpath("//table[@name = \"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
//            String cellData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
//            System.out.print(cellData + " | ");

        for (int r = 2; r <= totalRowSize + 1; r++) {  // Start from row 2 (to skip headers)
            for (int c = 1; c <= totalColumnSize; c++) {  // Loop through all columns
                // Correctly concatenate `r` and `c` in XPath
                String cellData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.print(cellData + "  |  ");// Print cell data
            }
            System.out.println(); // New line after each row

            List<WebElement> booksByMukesh = driver.findElements(By.xpath("//table[@name='BookTable']//td[text()='Mukesh']//preceding-sibling::td"));
            System.out.println("Books written by Mukesh:");

            // Loop through the list and print each book name
            for (WebElement book : booksByMukesh) {
                System.out.println(book.getText());
            }


        }

        // Close the browser
        driver.quit();

    }
}

