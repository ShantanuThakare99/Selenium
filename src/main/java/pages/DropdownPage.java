package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
        //'WebElement::getText' is a lambda expression
        //stream() converts it into a form we can process each element and apply transformations easily (like map(), collect, etc)
        //map() converts web-elements into String
        //collect() it gathers all the processed items into collection.
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
        //It locates a dropdown element on the page and wraps it into a Select object so you can interact with it easily.
    }

}
