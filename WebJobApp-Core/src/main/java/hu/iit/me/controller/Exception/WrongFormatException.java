package hu.iit.me.controller.Exception;

public class WrongFormatException extends Exception {
    public WrongFormatException() {
        super();
    }

    public WrongFormatException(String message) {
        super(message);
    }

    public WrongFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongFormatException(Throwable cause) {
        super(cause);
    }

    protected WrongFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
