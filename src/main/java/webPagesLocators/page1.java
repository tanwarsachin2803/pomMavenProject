package webPagesLocators;

import Utilites.UiBaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page1 {

    //in this we define the locators
    //here I am taking http://automationpractice.com/index.php

   public WebDriver  driver=null ;
    UiBaseClass ub;

    @FindBy(xpath="//*[@title='TUTORIALS']")
    public WebElement signInBtn;

    //Now we will construct parametrised constructor for each class so that we can initialize the webelements
    public page1(UiBaseClass ub)
    {
        this.ub=ub; //this is used to invoke the class objects
        PageFactory.initElements(driver,this);  //to initialize the webelements in the class
    }

}
