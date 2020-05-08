package de.youness;



import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerBsp {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.setLevel(Level.ALL);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);

        logger.severe("Schwerwiegender Fehler");
        logger.warning("Warnung");
        logger.info("Information");
        logger.config("Konfigurationshinweis");
        logger.fine("Fein");
        logger.finer("Feiner");
        logger.finest("Am feinsten");
    }
}

//        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
//        logger.setLevel(Level.ALL);
//
//        System.out.println("----------------1-------------------");
//        logger.severe("Schwerwiegender Fehler");
//        System.out.println("----------------2-------------------");
//        logger.warning("Warnung");
//        System.out.println("----------------3-------------------");
//        logger.info("Information");
//        System.out.println("----------------4-------------------");
//        logger.config("Konfigurationshinweis");
//        System.out.println("----------------5-------------------");
//        logger.fine("Fein");
//        System.out.println("----------------6-------------------");
//        logger.finer("Feiner");
//        System.out.println("----------------7-------------------");
//        logger.finest("Am feinsten");
//    }
//}
