package co.rajat.nummus.testapps;

import java.io.IOException;

import co.rajat.fulcrum.config.exceptions.ConfigurationException;
import co.rajat.nummus.constants.NummusConstants;

public class TestAppProperties
{
    public static void main (String[] args) throws IOException, ConfigurationException
    {
//        ConfigReader reader = new ConfigReader();
//        Properties prop = reader.read("/config.properties");
//        System.out.println(prop);
        
        System.out.println(NummusConstants.Config);
        
//        for (String envName : env.keySet()) {
//            System.out.format("%s=%s%n",
//                              envName,
//                              env.get(envName));
//        }
    }
}
