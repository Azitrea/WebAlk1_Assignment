package hu.iit.me.controller.Exception;

public class WrongFunctionParameterException extends Exception {
    public WrongFunctionParameterException() {
        super();
    }

    public WrongFunctionParameterException(String message) {
        super(message);
    }

    public WrongFunctionParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongFunctionParameterException(Throwable cause) {
        super(cause);
    }

    protected WrongFunctionParameterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
