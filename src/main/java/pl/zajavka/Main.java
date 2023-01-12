package pl.zajavka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.zajavka.logger1.Logger1;
import pl.zajavka.logger2.Logger2;
import pl.zajavka.loggerloop.LoggerLoop;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

//        wyswietla nam sie tylko info, warn, error poniewaz slf4j-simple loguje
//        standardowo info a jezeli info to warn oraz error

//        jezeli cos loguje debug to loguje tez info, warn, error
//        jezeli cos loguje trace to loguje wszystko
//        log.trace("hello zajavka. parametr {}", 123);
//        log.debug("hello zajavka. parametr {}", 234);
//        log.info("hello zajavka. parametr {}", 345);
//        log.warn("hello zajavka. parametr {}", 456);
//        log.error("hello zajavka. parametr {}", 567);

//        try {
//            method1();
//        } catch (Exception ex) {
//            log.error("Exception was thrown", ex);
//        }
//    }
//    private static void method1() {
//        method2();
//    }
//    private static void method2() {method3();}
//    private static void method3() {
//        method4();
//    }
//    private static void method4() {
//        method5();
//    }
//    private static void method5() {
//        throw new RuntimeException("Throwing some exception!");
//    }


//        UZYCIE LOGBACK aby go uzyc trzeba
//        - w build.gradle dodac imlementacje zeby pobrała biblioteka
//        - w klasach ktorych chcemy logowanie dodac
//        private static final Logger log = LoggerFactory.getLogger(xxx.class); gdzie xxx to klasa jaka ma byc logowana
//        - konfiguracja domyslna logbacka jest debug (zaloguje nam debug, info, warn, error)
//        - konfiguracja logowanie wrzucamy do pliku logback.xml
        log.trace("Logging trace message in: {}", Main.class.getName());
        log.debug("Logging debug message in: {}", Main.class.getName());
        log.info("Logging info message in: {}", Main.class.getName());
        log.warn("Logging warn message in: {}", Main.class.getName());
        log.error("Logging error message in: {}", Main.class.getName());

        Logger1.log();
        Logger2.log();
        LoggerLoop.log();

    }
}

