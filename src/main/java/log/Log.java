package log;

import methods.Methods;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.DOMConfiguration;

import java.lang.reflect.Method;

public class Log {

    public static Logger logger = Logger.getLogger(Methods.class);

    public  Log(){
        DOMConfigurator.configure("Log4j.xml");

    }
    public void info(String message){
        logger.info(message);
    }
    public void error(String  message){
        logger.error(message);
    }
}
