package hu.iit.me.controller.Exception;

public class JobAlreadyExistException extends Exception {

    public JobAlreadyExistException() {
        super();
    }

    public JobAlreadyExistException(String message) {
        super(message);
    }

    public JobAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public JobAlreadyExistException(Throwable cause) {
        super(cause);
    }

    protected JobAlreadyExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
