package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By email = By.id("email");
    private By retrieveButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void sendemail(String emailId){
        driver.findElement(email).sendKeys(emailId);
    }

    public EmailSentForRetrieve clickRetrieveButton(){
        driver.findElement(retrieveButton).click();
        return new EmailSentForRetrieve(driver);
    }


}


