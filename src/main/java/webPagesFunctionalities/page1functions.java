package webPagesFunctionalities;

import Utilites.UiBaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import webPagesLocators.page1;

public class page1functions {

    UiBaseClass ub;
    WebDriver driver;

    public page1functions(UiBaseClass ub) {
        this.ub=ub; //this is used to invoke the class objects
        this.ub.driver=driver;
        PageFactory.initElements(driver,this);  //to initialize the webelements in the class

    }
    public void signInButton() {
    }
}