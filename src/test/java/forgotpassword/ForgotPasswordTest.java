package forgotpassword;

import base.BaseTests3;
import org.testng.annotations.Test;
import pages.EmailSentForRetrieve;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTests3 {

    @Test
    public void testEmailSentSuccessful(){
        ForgotPasswordPage forgotPass = homePage.clickForgotPassword();
        forgotPass.sendemail("tau@example.com");
        EmailSentForRetrieve email_sent_page = forgotPass.clickRetrieveButton();
        assertTrue(email_sent_page.sentEmailStatus().contains("Your e-mail's been sent!"), "Alert text is Incorrect");
        //If the 'The Internet' website is broken then above assertTrue will fail. In that case try to use the below assertTrue.
//        assertTrue(email_sent_page.sentEmailStatus().contains("Internal Server Error"), "Alert text is Incorrect");

    }
}
