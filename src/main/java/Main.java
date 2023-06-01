import entities.Order;
import filters.ContextFilter;
import pipes.Pipeline;

public class Main {

    public static void main(String[] args) {
        Pipeline pipeline = new Pipeline();

        ContextFilter contexto = new ContextFilter();
        contexto.setOrder(new Order(
                "test_id",
                "mock_buyer",
                "mock_product"
        ));

        pipeline.executePipeline(contexto);
    }
}
