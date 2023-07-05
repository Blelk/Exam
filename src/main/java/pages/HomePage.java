package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    private static final String HOME_PAGE_URL = "http://shop.pragmatic.bg/";

    @FindBy(xpath = "//*[@ class='fa fa-user']/ ..")
    private static WebElement myAccountButton;

    @FindBy(xpath = "//*[@ class='fa fa-user']/ ../../ul/li[1]")
    private static WebElement registerButton;

    static {
        PageFactory.initElements(driver, HomePage.class);
    }

    public static void goToHomePage(){
        driver.get(HOME_PAGE_URL);
    }

    public static void clickOnMyAccountButton(){
        clickOnElement(myAccountButton);
    }

    public static void  clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
}
