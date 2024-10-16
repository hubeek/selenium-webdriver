package com.selenium.seleniumwebdriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class F1TempoTest {
    @Test
    public void MaxResults() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        WebDriver driver = new ChromeDriver(options);

        WebDriver driver = new ChromeDriver();


        try {
            driver.get("https://www.f1-tempo.com");


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Step 1: Click the first dropdown (Year...) and choose 2023
            WebElement yearPlaceholder = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-2-placeholder")));
            yearPlaceholder.click();
            WebElement year2023Option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='2023']")));
            year2023Option.click();

            // Step 2: Click the second dropdown (GP...) and choose the option containing "Las Vegas"
            WebElement gpSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'GP')]")));
            gpSelect.click();
            WebElement lasVegasOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Las Vegas')]")));
            lasVegasOption.click();

            // Step 3: Click the third dropdown (Qualifying) and choose "Qualifying"
            WebElement sessionSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Session')]")));
            sessionSelect.click();
            WebElement qualifyingOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Qualify')]")));
            qualifyingOption.click();
            // step 4
            WebElement driverSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Driver')]")));
            driverSelect.click();
            WebElement driverOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'VER')]")));
            driverOption.click();
        } finally {
            // Close the browser
            driver.quit();
        }

    }
}
