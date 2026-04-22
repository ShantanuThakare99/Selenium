package Practice;

/*Practice Task1:
-> open the browser
-> maximize the browser
-> enter into DWS page
-> enter into Amazon page
-> go back to DWS page
-> refresh th web page
-> go back to Amazon page
-> close the browser
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.quit();
    }
}
