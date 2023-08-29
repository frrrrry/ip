package exception;

public class InvalidCommandException extends DukeException {
    protected String message;

    public InvalidCommandException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
