package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseTests3 {

    private WebDriver driver;
    protected HomePage homePage;
    //This is marked as protected, so that test classes that inherit from this will access to this HomePage

    @BeforeClass  //Due to this annotation it will run this method before any test class to launch the application
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        goHome(); //This will launch the web application and it will be on HomePage

        homePage = new HomePage(driver);  //Once we are on HomePage we create a new instance of HomePage
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
