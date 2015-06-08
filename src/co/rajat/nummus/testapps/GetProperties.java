package co.rajat.nummus.testapps;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Properties;

public class GetProperties
{
    public void readProperties() throws IOException
    {
        String result = "";
        Properties prop = new Properties();
        String propFileName = "config.properties";
        
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        
        if (inputStream != null)
        {
            prop.load(inputStream);
        }
         
        LocalDate time = LocalDate.now();
         
        // get the property value and print it out
        String user = prop.getProperty("user");
        String company1 = prop.getProperty("company");
         
        result = "Company List = " + company1;
        System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);
    }
}
