import Pageobjects.BaseTest;
import Steps.SignUp;
import org.junit.Assert;
import org.junit.Test;


public class Sing_up_test extends BaseTest {
    SignUp done = new SignUp();
    @Test
    public void signUp() throws Exception {
        done.navigateToSignUpForm();
        done.enterZipCode();
        done.enterMainData();
        Assert.assertEquals("Account is created!", done.checkConfMessage());
    }



}
