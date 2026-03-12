package creational_patterns.singleton_pattern;

public class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance(){
        if ( instance==null){
            return new Logger();
        }
        return instance;
    }

    public void info(String message){
        System.out.println("[INFO] -> "+message);
    }
}
/*
Example:::::

    "   Logger logger = Logger.getInstance();
        logger.info("Application started"); "

-------------------------------------
Application
   ├ Service1
   ├ Service2
   └ Service3
        ↓
     Logger (single instance)
--------------------------------------
A logging system should be centralized.

If multiple loggers existed:
    - logs become inconsistent
    - file locks occur

 */

