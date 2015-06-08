package co.rajat.nummus.constants;

import java.util.Properties;

import co.rajat.fulcrum.config.ConfigReader;
import co.rajat.fulcrum.config.exceptions.ConfigurationException;
import co.rajat.fulcrum.dal.MongoDAL;
import co.rajat.fulcrum.dal.exceptions.DALException;

public class NummusConstants
{
    private static final String Environment = System.getenv().get(PropertyConstants.INSTANCE);
    
    private static final String CommonPropertiesPath = "/config.common.properties";

    private static final String InstancePropertiesPath = "/config." + Environment.toLowerCase() + ".properties";

    public static final Properties Config = new Properties();
    
    public static MongoDAL DAL = null;
    
    static 
    {
        try
        {            
            ConfigReader reader = new ConfigReader();
            
            Config.putAll(reader.read(CommonPropertiesPath));
            Config.putAll(reader.read(InstancePropertiesPath));
            
            DAL = MongoDAL.getInstance(Config);
        }
        catch (ConfigurationException | DALException e)
        {
            e.printStackTrace();
        }
    }
}
