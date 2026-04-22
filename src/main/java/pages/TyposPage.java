package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage {
    private WebDriver driver;
    private By para = By.cssSelector("div p:nth-of-type(1)");

    public TyposPage(WebDriver driver){
        this.driver = driver;
    }

    public String paraTypo(){
        return driver.findElement(para).getText();
    }
}
