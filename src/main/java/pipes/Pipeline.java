package pipes;

import exceptions.BrokenPipelineException;
import filters.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe referente ao pipeline que será executado, ela define os pipes e os filters que serão utilizados e a ordem dos mesmos.
 */
public class Pipeline {
    private final List<Filter> filters;

    public Pipeline() {
        filters = new ArrayList<>();
        filters.add(new AuthenticationFilter());
        filters.add(new ValidationFilter());
        filters.add(new ProcessingFilter());
    }


    /**
     * Método que executa a pipeline, caso haja algum problema na execução da mesma, a exceção BrokenPipelineException é lançada e tratada.
     * @param contexto Contexto que mantém os dados e resultados entre os filtros
     */
    public void executePipeline(ContextFilter contexto) {
        try {
            for (Filter filter : filters) {
                filter.execute(contexto);
            }
        } catch (BrokenPipelineException brokenPipeline) {
            System.out.println("\n\n");
            System.out.println(brokenPipeline.getMessage());
        }
    }
}
