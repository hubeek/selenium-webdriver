package com.selenium.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestRun {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {

        driver.get("https://hjh.devsnips.nl");

        driver.getTitle();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement searchButton = driver.findElement(By.xpath("//a[text()='search']"));
        searchButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit-keys")));

        inputField.clear();

        inputField.sendKeys("postgres");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-submit")));

        submitButton.click();

        WebElement ocpLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Docker dbs']")));

        ocpLink.click();


        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
