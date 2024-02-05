package nl.novi.techiteasy.exceptions;

public class RecordNotFoundExceptions extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public RecordNotFoundExceptions() {
        super();
    }
    public RecordNotFoundExceptions(String message) {
        super(message);
    }
}
