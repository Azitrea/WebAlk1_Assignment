package hu.iit.me.controller.Exception;

public class WrongSalaryException extends Exception {
    public WrongSalaryException() {
        super();
    }

    public WrongSalaryException(String message) {
        super(message);
    }

    public WrongSalaryException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongSalaryException(Throwable cause) {
        super(cause);
    }

    protected WrongSalaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
