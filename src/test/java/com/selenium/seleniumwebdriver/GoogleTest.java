package com.selenium.seleniumwebdriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleTest {

    @Test
    public void openGoogleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Google", "Page title mismatch");
        driver.quit();
    }

}
