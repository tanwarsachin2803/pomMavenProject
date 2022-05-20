package Utilites;


import org.testng.annotations.DataProvider;

public class dataProvider extends UiBaseClass{
    UiBaseClass ub;
    public dataProvider(UiBaseClass ub){this.ub=ub;}


    //below is the format to make a method for the data provider

    /*  @DataProvider(name="name_of_dataProvider")
    public  Object[][] dpMethod() {
        return new Object[][]{values}
    }
    */


}
