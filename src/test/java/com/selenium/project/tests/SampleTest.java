package com.selenium.project.tests;

import com.selenium.project.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
    
    @Test
    public void sampleGoogleTest() {
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"), "Page title should contain 'Google'");
    }
}
