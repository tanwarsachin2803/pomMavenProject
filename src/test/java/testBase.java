import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.nio.file.Path;

public class testBase {

   public WebDriver driver;
    String pathOfProject=System.getProperty("user.dir");
    //this class will be inherited by all the test classes and all the properties or variables define here

 /*   @BeforeSuite
    public void settingBrowser()
    {
        System.out.println(pathOfProject);
        WebDriverManager.chromedriver().setup();  // this setup the driver and make it compatible with the browser
        System.out.println("Browser executable path is set as :- "+System.getProperty("webdriver.chrome.driver"));
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver",pathOfProject+"//driver//chromedriver.exe");
        driver.get("http://automationpractice.com/index.php");
    }

    @BeforeClass
    public void setup(){

    }
*/
    @AfterSuite
    public void quitBrowsers(){
        driver.quit();
    }
}
