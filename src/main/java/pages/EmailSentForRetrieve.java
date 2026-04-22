package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentForRetrieve {
    private WebDriver driver;
    private By emailSentStatus =  By.tagName("h1");

    public EmailSentForRetrieve(WebDriver driver){
        this.driver = driver;
    }

    public String sentEmailStatus(){
        return driver.findElement(emailSentStatus).getText();
    }
}
