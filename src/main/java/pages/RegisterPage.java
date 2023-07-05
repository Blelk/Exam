package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.EmailGenerator;

public class RegisterPage extends BasePage {
    @FindBy(id = "input-firstname")
    private static WebElement firstNameInput;
    @FindBy(id = "input-lastname")
    private static WebElement lastNameInput;
    @FindBy(id = "input-email")
    private static WebElement emailInput;

    @FindBy(id = "input-telephone")
    private static WebElement phoneNumberInput;

    @FindBy(id = "input-password")
    private static WebElement passwordInput;
    @FindBy(id = "input-confirm")
    private static WebElement confirmPasswordInput;

    @FindBy(name = "agree")
    private static WebElement privacyCheckBox;

    @FindBy(css = "input[value='Continue']")
    private static WebElement continueButton;



    static {
        PageFactory.initElements(driver, RegisterPage.class);
    }

    public static void writeFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
    }

    public static void writeLastName(String lastName){
        lastNameInput.sendKeys(lastName);
    }

    public static void writeEmailAddress(){
        emailInput.sendKeys(EmailGenerator.generator());
    }

    public static void writePhoneNumber(String phoneNumber){
        phoneNumberInput.sendKeys(phoneNumber);
    }

    public static void writePassAndConfirmPassword(String password){
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);
    }

    public static void clickOnPrivacyCheckBox(){
        clickOnElement(privacyCheckBox);
    }

    public static void clickContinueButton(){
        clickOnElement(continueButton);
    }

}
