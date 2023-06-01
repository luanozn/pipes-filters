package filters;

import exceptions.BrokenPipelineException;
import util.RequestHandler;

/**
 * Filtro de autenticação, aqui pode-se ver um mock da autenticação de um usuário
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(ContextFilter contexto) {

        boolean mockFailAuth = false;

        try {
            RequestHandler.handleRequest("Autenticação", "Autenticando usuário");

            if (mockFailAuth) {
                throw new BrokenPipelineException("A autenticação falhou! Finalizando pipeline");
            } else {
                contexto.setAuthenticated(true);
            }

        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
        }
    }
}

