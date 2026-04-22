package base;

//First Test - Ch 2- Web Driver

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(375, 812));
        //The above code can be used for specifically testing the different screen sized devices like tablet, ipad, mobile, etc.
        //In this code 375 - width ,and 812 - height of the device on which it is checked to get a view of how it looks.
        driver.get("https://the-internet.herokuapp.com/");

//        WebElement inputsLink = driver.findElement(By.cssSelector("[href$='inputs']"));
//        inputsLink.click();

        List<WebElement> links = driver.findElements(By.cssSelector("li:nth-child(3n+3)"));
        int list_size = links.size();
        System.out.println(list_size);
        for(WebElement element : links){
            System.out.println(element.getText());
        }
        System.out.println();
        System.out.println(driver.getTitle());
        driver.quit();

    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setup();
    }
}
/*
* "ul li:nth-child(27)"
* "[href$='inputs']"
* "li a[href$='inputs']"
* "a[href$='inputs']"
* "[href*='input']"
* ""
*/
