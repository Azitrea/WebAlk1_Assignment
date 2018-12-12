package hu.iit.me.controller.Exception;

public class AmountIsTooMutch extends Exception {
    public AmountIsTooMutch() {
        super();
    }

    public AmountIsTooMutch(String message) {
        super(message);
    }

    public AmountIsTooMutch(String message, Throwable cause) {
        super(message, cause);
    }

    public AmountIsTooMutch(Throwable cause) {
        super(cause);
    }

    protected AmountIsTooMutch(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
