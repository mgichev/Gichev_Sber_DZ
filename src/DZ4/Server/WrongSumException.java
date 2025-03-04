package DZ4.Server;

public class WrongSumException extends RuntimeException {

    public enum WrongSumExceptionState {
        SUM_NOT_DIV_BY_100,
        SUM_MORE_THAN_BILL,
        SUM_IS_NEGATIVE,
        SUM_MORE_THAN_MAX_VALUE
    }

    private final WrongSumExceptionState state;
    public WrongSumException(WrongSumExceptionState state) {
        super(state.toString());
        this.state = state;
    }

    public WrongSumExceptionState getState() {
        return state;
    }
}

