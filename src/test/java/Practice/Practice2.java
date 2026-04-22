package Practice;

/*Practice Task2:
-> open the browser
-> maximize the browser
-> enter into DWS page
-> verify the page by using URL.
-> close the page
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice2 {
    public static void main(String[] args) {
        String exp_url = "https://demowebshop.tricentis.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/");
        String act_url = driver.getCurrentUrl();
        if(exp_url.equals(act_url)){
            System.out.println("Verification using URL is Successful.");
        }else{
            System.out.println("Verification using URL is Failed");
        }

        driver.quit();
    }
}
