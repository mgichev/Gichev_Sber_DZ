package DZ4.DZ4_1.Validator;

public class AccountIsLockedException extends RuntimeException {
    private final double timeInSec;
    public AccountIsLockedException(String message, double timeInMillis) {
        super(message);
        this.timeInSec = timeInMillis / 1000;
    }

    public double getTimeInSec() {
        return timeInSec;
    }
}
