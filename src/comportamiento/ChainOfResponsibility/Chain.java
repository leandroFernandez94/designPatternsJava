package comportamiento.ChainOfResponsibility;

import comportamiento.ChainOfResponsibility.Logger.AbstractLogger;
import comportamiento.ChainOfResponsibility.Logger.ConsoleLogger;
import comportamiento.ChainOfResponsibility.Logger.ErrorLogger;
import comportamiento.ChainOfResponsibility.Logger.FileLogger;

/**
 * Created by leandro on 6/30/17.
 */
public class Chain {
    /*
        Propósito: Evita acoplar el emisor de una solicitud a su receptor, dando a más de un objeto
        la posibilidad de responder a la solicitud. Encadena los objetos receptores y pasa la solicitud
        a través de la cadena hasta que es procesada por algún objeto.

        Consecuencias:
        ● Reduce el acoplamiento porque libera a un objeto de tener que saber qué otro objeto
        maneja una solicitud.
        ● Añade flexibilidad para asignar responsabilidades a objetos.
        ● No se garantiza la recepción dado que las solicitudes no tienen un receptor explícito
        no hay garantía de que sean manejadas por alguno de los objetos que forman parte
        de la cadena.
     */

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
