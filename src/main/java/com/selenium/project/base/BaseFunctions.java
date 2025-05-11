package com.selenium.project.base;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class BaseFunctions {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private static final int DEFAULT_TIMEOUT = 10;

    public BaseFunctions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
    }

    /**
     * Find element with explicit wait
     *
     * @param by locator to find element
     * @return WebElement
     */
    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findElements(By locator) {
        try {
            return driver.findElements(locator);
        } catch (Exception e) {
            System.out.println("Error finding elements: " + e.getMessage());
            return null; // or return an empty list if preferred
        }
    }

    /**
     * Click on element with explicit wait
     *
     * @param by locator to find element
     */
    public void clickElement(By by) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
            element.click();
        } catch (ElementClickInterceptedException e) {
            // Handle cases where element might be covered by another element
            WebElement element = findElement(by);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }

    /**
     * Fill text in input field
     *
     * @param by   locator to find element
     * @param text text to fill
     */
    public void fillText(By by, String text) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Check if element is displayed
     *
     * @param by locator to find element
     * @return boolean
     */
    public boolean isElementDisplayed(By by) {
        try {
            return findElement(by).isDisplayed();
        } catch (TimeoutException | NoSuchElementException e) {
            return false;
        }
    }

    /**
     * Get text from element
     *
     * @param by locator to find element
     * @return String
     */
    public String getText(By by) {
        return findElement(by).getText();
    }

    /**
     * Get attribute value from element
     *
     * @param by        locator to find element
     * @param attribute attribute name
     * @return String
     */
    public String getAttribute(By by, String attribute) {
        return findElement(by).getAttribute(attribute);
    }

    /**
     * Wait for element to be visible
     *
     * @param by locator to find element
     * @return WebElement
     */
    public WebElement waitForElementVisible(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /**
     * Wait for element to be invisible
     *
     * @param by locator to find element
     */
    public void waitForElementInvisible(By by) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    /**
     * Scroll element into view
     *
     * @param by locator to find element
     */
    public void scrollIntoView(By by) {
        WebElement element = findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Check if element exists
     *
     * @param by locator to find element
     * @return boolean
     */
    public boolean elementExists(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     * Wait for page load complete
     */
    public void waitForPageLoadComplete() {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }

    public void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        }
    }

    @FindBy(xpath = "//a[text()='Try different image']")
    public WebElement amazonCaptcha;

    public void handleCaptcha(){ //captcha varsa aşacak yoksa bir şey yapmadan devam edecek
        try {
            BaseFunctions baseFunctions = new BaseFunctions(driver);
            baseFunctions.clickElement(By.xpath("//a[text()='Try different image']"));
        } catch (Exception e) {

        }
    }
}

