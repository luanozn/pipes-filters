package filters;

import exceptions.BrokenPipelineException;
import util.RequestHandler;

/**
 * Classe que realiza a validação de um pedido
 */
public class ValidationFilter implements Filter{

    @Override
    public void execute(ContextFilter contexto) {
        boolean mockFailValidation = false;

        try {
            RequestHandler.handleRequest("Validação", "Validando pedido");

            if (mockFailValidation) {
                throw new BrokenPipelineException("A Validação falhou! Finalizando pipeline");
            } else {
                contexto.setValidated(true);
            }

        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
        }
    }
}
