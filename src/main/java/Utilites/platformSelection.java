package Utilites;

import java.io.IOException;
import java.util.Properties;

public class platformSelection extends UiBaseClass{
    UiBaseClass ub;
    Properties prop;

    public platformSelection(UiBaseClass ub){this.ub=ub;}

    public void selectPlatform() throws IOException {
        prop=ub.readProp("configProp.properties");

         if(prop.getProperty("platform").contentEquals("ios"))
        {

        }
        else if(prop.getProperty("platform").contentEquals("android"))
         {

         }

    }


}
