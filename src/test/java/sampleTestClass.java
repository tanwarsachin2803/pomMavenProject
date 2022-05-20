import Utilites.UiBaseClass;
import Utilites.actionClass;
import Utilites.excelOperations;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import webPagesFunctionalities.page1functions;
import webPagesLocators.page1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class sampleTestClass  {

UiBaseClass ub;
actionClass ac;
page1 p1;
Logger log;
excelOperations exo;

@BeforeSuite
public void setUb()
{
    ub=new UiBaseClass(); // first we have to call the main baseClass
    ac=new actionClass(ub);
    p1=new page1(ub);
    exo= new excelOperations(ub);
    log=Logger.getLogger(String.valueOf(sampleTestClass.class));
    PropertyConfigurator.configure(ub.filePath+"/propertiesFile/log4.properties");

}

    @Test()
    public void runTest() throws InterruptedException, IOException {
        System.out.println("Passed values are ");
  }

  @AfterClass
    public void quitBrowser()
  {
      ub.driver.quit();
  }

}
