package creational_patterns.singleton_pattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigManager {
    private ConfigManager instance;
    private Properties properties=new Properties();

    private ConfigManager(){
        try{
            FileInputStream configFile=new FileInputStream("config.properties");
            properties.load(configFile);
            Logger logger=Logger.getInstance();
            logger.info("Configuration Loaded");
        } catch (IOException e){
            throw new RuntimeException("Configuration cannot be loaded");
        }
    }

}
