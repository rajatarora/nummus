package co.rajat.nummus.testapps;

import java.io.IOException;
import java.util.Map;

import co.rajat.fulcrum.config.exceptions.ConfigurationException;
import co.rajat.nummus.constants.NummusConstants;

public class TestAppProperties
{
    public static void main (String[] args) throws IOException, ConfigurationException
    {
//        ConfigReader reader = new ConfigReader();
//        Properties prop = reader.read("/config.properties");
//        System.out.println(prop);
//    	System.setProperty("logfile.name", System.getenv("NUMMUS_LOG"));
    	System.out.println(System.getProperty("logfile.name"));
        System.out.println(NummusConstants.Config);
        
//    	Map<String, String> env = System.getenv();
//        for (String envName : env.keySet()) {
//            System.out.format("%s=%s%n",
//                              envName,
//                              env.get(envName));
//        }
    }
}
