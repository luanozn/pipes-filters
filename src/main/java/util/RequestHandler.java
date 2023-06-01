package util;

import java.util.concurrent.TimeUnit;

/**
 * Classe mockada para simular os resultados dos Filters.
 */
public class RequestHandler {

    public static void handleRequest(String processName, String message) throws InterruptedException {

        System.out.printf("\n\n/*------------------ FILTRO DE %s ----------------*/\n", processName.toUpperCase());
        System.out.print(message);
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(".");
        System.out.println("/*----------------------------------------------------------*/");

    }
}
