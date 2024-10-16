package com.selenium.seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NgGoogleTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        this.driver = new ChromeDriver();
    }

    @Test
    public void openGoogleTest() {
        this.driver.get("https://www.google.com");
        String pageTitle = this.driver.getTitle();
        Assert.assertEquals(pageTitle, "Google", "Page title mismatch");
    }

    @AfterClass
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}
