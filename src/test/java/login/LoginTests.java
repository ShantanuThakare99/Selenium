package login;

import base.BaseTests3;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests3 {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secure_area_page = loginPage.clickLoginButton();
        assertTrue(secure_area_page.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");

    }
}
