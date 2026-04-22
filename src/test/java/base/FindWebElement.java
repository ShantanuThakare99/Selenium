package base;

//Task#1 - Ch 3- Finding Web Elements

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FindWebElement {
    WebDriverWait wait;
    public static void main(String[] args){

        FindWebElement obj1 = new FindWebElement();
        obj1.findElement();

    }

    public void findElement(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftContLink1 = driver.findElement(By.linkText("Shifting Content"));
        if(shiftContLink1.isDisplayed()){
            System.out.println("Web Element visible with LinkText");
        }

        WebElement shiftContlink2 = driver.findElement(By.cssSelector("a[href*='shift']"));
        if(shiftContlink2.isDisplayed()){
            System.out.println("WebElement visible with cssSelector Locate by Attribute with TagName");
        }

        shiftContLink1.click();
        WebElement menuElement = driver.findElement(By.cssSelector("[href*='menu']"));
        menuElement.click();
        List<WebElement> menuElementList = driver.findElements(By.cssSelector("ul li:nth-of-type(n)"));
        for(WebElement element : menuElementList){
            String menuList = element.getText();
            System.out.println(menuList);
        }

        driver.quit();
    }

}
