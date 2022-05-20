package Utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class UiBaseClass {

   public WebDriver driver;
   public WebDriverWait wait;
   Logger log=Logger.getLogger(String.valueOf(UiBaseClass.class));
    Properties prop;
   public String filePath=System.getProperty("user.dir"); // this will calls the path upto the project

    public Properties readProp(String fileName) throws IOException {
        prop=new Properties();
        FileInputStream fis=new FileInputStream(filePath+"//propertiesFile//"+fileName);
        prop.load(fis);
        return prop;
    }

    public void setup() throws IOException {
        Properties prop1=readProp("configProp.properties");
        String browser=prop1.getProperty("browser").toString();
        log.info("Setting up the browser");
        if(browser.contentEquals("chrome"))
        {
        WebDriverManager.chromedriver().setup(); //used to download and install newest version of driver
        driver=new ChromeDriver();
        }
        if(browser.contentEquals("safari"))
        {
            WebDriverManager.safaridriver().setup(); //used to download and install newest version of driver
            driver=new SafariDriver();
        }
        if(browser.contentEquals("safari"))
        {
            WebDriverManager.firefoxdriver().setup(); //used to download and install newest version of driver
            driver=new FirefoxDriver();
        }
        if(browser.contentEquals("explorer"))
        {
            WebDriverManager.edgedriver().setup(); //used to download and install newest version of driver
            driver=new InternetExplorerDriver();
        }

    }

    public void openUrl() throws IOException {
        prop=readProp("configProp.properties");
        String url=prop.getProperty("url");
        log.info("Opening url "+url);
        driver.get(url);
    }

    public WebDriverWait wait(WebElement element)
    {
        wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
        return wait;
    }
}
