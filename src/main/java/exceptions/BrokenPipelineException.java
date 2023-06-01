package exceptions;

public class BrokenPipelineException extends RuntimeException{

    public BrokenPipelineException(String message) {
        super(message);
    }
}
