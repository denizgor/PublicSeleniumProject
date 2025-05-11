package com.selenium.project.tests;
import com.selenium.project.base.BaseFunctions;
import com.selenium.project.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
    
    // Locators for header elements
    private final By amazonLogo = By.id("nav-logo-sprites");
    private final By searchDropdown = By.id("searchDropdownBox");
    private final By searchBar = By.id("twotabsearchtextbox");
    private final By searchButton = By.id("nav-search-submit-button");
    private final By languageSelector = By.id("icp-nav-flyout");
    private final By accountList = By.id("nav-link-accountList");
    private final By returnsOrders = By.id("nav-orders");
    private final By cartIcon = By.id("nav-cart");
    private final By dismissButton = By.className("a-button-inner");
    @Test
    public void verifyHeaderNavigationElements() {
        // Navigate to Amazon homepage
        driver.get("https://www.amazon.com/");

        // Initialize BaseFunctions
        BaseFunctions baseFunctions = new BaseFunctions(driver);


        // Handle Captcha
        baseFunctions.handleCaptcha();


        // Verify presence and clickability of all header elements
        Assert.assertTrue(baseFunctions.isElementDisplayed(amazonLogo), "Amazon logo should be visible");
        //Assert.assertTrue(baseFunctions.isElementDisplayed(searchDropdown), "Search dropdown should be visible");
        Assert.assertTrue(baseFunctions.isElementDisplayed(searchBar), "Search bar should be visible");
        Assert.assertTrue(baseFunctions.isElementDisplayed(searchButton), "Search button should be visible");
        Assert.assertTrue(baseFunctions.isElementDisplayed(languageSelector), "Language selector should be visible");
        Assert.assertTrue(baseFunctions.isElementDisplayed(accountList), "Account & Lists should be visible");
        Assert.assertTrue(baseFunctions.isElementDisplayed(returnsOrders), "Returns & Orders should be visible");
        Assert.assertTrue(baseFunctions.isElementDisplayed(cartIcon), "Cart icon should be visible");
        
        // Verify elements are clickable
        Assert.assertTrue(baseFunctions.elementExists(amazonLogo), "Amazon logo should be clickable");
        Assert.assertTrue(baseFunctions.elementExists(searchDropdown), "Search dropdown should be clickable");
        Assert.assertTrue(baseFunctions.elementExists(searchBar), "Search bar should be clickable");
        Assert.assertTrue(baseFunctions.elementExists(searchButton), "Search button should be clickable");
        Assert.assertTrue(baseFunctions.elementExists(languageSelector), "Language selector should be clickable");
        Assert.assertTrue(baseFunctions.elementExists(accountList), "Account & Lists should be clickable");
        Assert.assertTrue(baseFunctions.elementExists(returnsOrders), "Returns & Orders should be clickable");
        Assert.assertTrue(baseFunctions.elementExists(cartIcon), "Cart icon should be clickable");
        
        // Verify language selector shows "EN"
        String languageText = baseFunctions.getText(languageSelector);
        Assert.assertTrue(languageText.contains("EN"), "Language selector should show 'EN'");
    }
}
