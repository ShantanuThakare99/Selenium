package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage {
    private WebDriver driver;
    private By modalTitle = By.cssSelector("div.modal-title");
    private By modalCloseBtn = By.cssSelector("div.modal-footer p");
    private By reEnableModalBtn = By.id("restart-ad");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickModalCloseBtn(){
        driver.findElement(modalCloseBtn).click();
    }

    public void modalTitleVisibility(){
        WebElement title = driver.findElement(modalTitle);
        wait.until(ExpectedConditions.visibilityOf(title));
    }
    public String getModalTitle(){
        modalTitleVisibility();
        return driver.findElement(modalTitle).getText();
    }

    public void clickRestartModal(){
        driver.findElement(reEnableModalBtn).click();
        getModalTitle();
        clickModalCloseBtn();
    }
}
