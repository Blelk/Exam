package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.SuccesRegisteredPage;

public class CreateNewAccountTest extends BaseTest {
    @Test
    public void createNewAccountTest(){
        HomePage.goToHomePage();
        HomePage.clickOnMyAccountButton();
        HomePage.clickOnRegisterButton();
        RegisterPage.writeFirstName("Petar");
        RegisterPage.writeLastName("Kirilov");
        RegisterPage.writeEmailAddress();
        RegisterPage.writePhoneNumber("445665324");
        RegisterPage.writePassAndConfirmPassword("parola123");
        RegisterPage.clickOnPrivacyCheckBox();
        RegisterPage.clickContinueButton();
        SuccesRegisteredPage.verifySuccessText();
    }
}
