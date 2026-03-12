package creational_patterns.singleton_pattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
Usage:::::::::::::
            public class DatabaseService {

                public void connect() {

                    ConfigManager config =
                            ConfigManager.getInstance();

                    String url = config.getProperty("db.url");
                    String username = config.getProperty("db.username");

                    System.out.println("Connecting to DB: " + url);
                    System.out.println("Username: " + username);
                }
            }

Configuration is loaded one time.

Application
   │
   ├ UserService
   ├ PaymentService
   └ OrderService
         │
         ▼
   ConfigManager (Singleton)
         │
     config.properties

 */
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

    public synchronized ConfigManager getInstance(){
        if(instance==null){
            return new ConfigManager();
        }
        return instance;
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }

}
