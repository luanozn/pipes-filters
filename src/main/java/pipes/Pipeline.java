package pipes;

import exceptions.BrokenPipelineException;
import filters.*;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {
    private List<Filter> filtros;

    public Pipeline() {
        filtros = new ArrayList<>();
        // Adicione os filtros específicos do comércio eletrônico ao pipeline
        filtros.add(new AuthenticationFilter());
        filtros.add(new ValidationFilter());
        filtros.add(new ProcessingFilter());
    }

    public void executarPipeline(ContextFilter contexto) {
        try {
            for (Filter filtro : filtros) {
                filtro.execute(contexto);
            }
        } catch (BrokenPipelineException brokenPipeline) {
            System.out.println("\n\n");
            System.out.println(brokenPipeline.getMessage());
        }
    }
}
