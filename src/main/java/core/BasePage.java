package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Browser;

public abstract class BasePage {
    protected static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }

    public static void clickOnElement(WebElement element) {
        element.click();
    }
}
