package exceptions;


/**
 * Exception lançada quando o pipeline quebra
 */
public class BrokenPipelineException extends RuntimeException{

    public BrokenPipelineException(String message) {
        super(message);
    }
}
