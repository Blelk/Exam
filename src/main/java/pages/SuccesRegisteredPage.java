package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SuccesRegisteredPage extends BasePage {
    @FindBy(tagName = "h1")
    private static WebElement h1Element;

    static {
        PageFactory.initElements(driver, SuccesRegisteredPage.class);
    }

    public static void verifySuccessText(){
        String h1Text = h1Element.getText();
        Assert.assertEquals(h1Text, "Your Account Has Been Created!");
    }
}
