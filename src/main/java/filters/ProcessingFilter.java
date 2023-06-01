package filters;

import exceptions.BrokenPipelineException;
import java.util.concurrent.TimeUnit;
import util.RequestHandler;

public class ProcessingFilter implements  Filter{

    @Override
    public void execute(ContextFilter contexto) {

        try {
            RequestHandler.handleRequest("Processamento", "Processando pedido");

        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
        }

        if (contexto.isAuthenticated() && contexto.isValidated()) {
            System.out.println("Pedido processado com sucesso!");
        } else {
            throw new BrokenPipelineException("Pedido inválido. Não foi possível processar.");
        }
    }
}
