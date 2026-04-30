package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WysiwygEditorPage {
    private WebDriver driver;
    private By alert_box = By.cssSelector("div[class='tox-notifications-container']");
    private By close_button = By.cssSelector("div[aria-label='Close']");
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("button[title='Increase indent']");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void alertBoxVisibility(){
        WebElement alertBox = driver.findElement(alert_box);
        if(alertBox.isDisplayed()){
            driver.findElement(close_button).click();
        }
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

}
