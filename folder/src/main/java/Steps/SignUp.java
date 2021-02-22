package Steps;

import Pageobjects.BaseTest;
import Pageobjects.MainPage;
import Pageobjects.SignUpPage;

public class SignUp extends BaseTest {

    MainPage mainPage = new MainPage(getDriver());
    SignUpPage signUpPage = new SignUpPage(getDriver());


    public void navigateToSignUpForm() {
        mainPage.clickSignUpLink();
    }

    public void enterZipCode() {
        signUpPage.sendKeysZipCodeField("61050");
        signUpPage.clickContinueBtn();
    }

    public void enterMainData() {
        signUpPage.sendKeysFirstNameField("Dmitriy");
        signUpPage.sendKeysLastNameField("Marchenko");
        signUpPage.sendKeysEmailField("student@qa.com");
        signUpPage.sendKeysPassword1Field("place_for_your_pass");
        signUpPage.sendKeysPasswordField2("place_for_your_pass");
        signUpPage.clickRegisterBtn();
    }

    public String checkConfMessage() {
        return signUpPage.getTextConfirmationMessage();
    }

}
