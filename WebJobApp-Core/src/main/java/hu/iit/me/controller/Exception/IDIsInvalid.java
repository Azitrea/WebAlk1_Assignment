package hu.iit.me.controller.Exception;

public class IDIsInvalid extends Exception {
    public IDIsInvalid() {
        super();
    }

    public IDIsInvalid(String message) {
        super(message);
    }

    public IDIsInvalid(String message, Throwable cause) {
        super(message, cause);
    }

    public IDIsInvalid(Throwable cause) {
        super(cause);
    }

    protected IDIsInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
