package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BaseTests1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> list = driver.findElements(By.cssSelector("li:nth-child(3n+3)"));
        System.out.println(list.size());
        for(WebElement element : list){
            System.out.println(element.getText());
        }

        driver.quit();
    }
}
