package hu.iit.me.controller.Exception;

public class IDAlreadyExistException extends Exception {
    public IDAlreadyExistException() {
        super();
    }

    public IDAlreadyExistException(String message) {
        super(message);
    }

    public IDAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public IDAlreadyExistException(Throwable cause) {
        super(cause);
    }

    protected IDAlreadyExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
