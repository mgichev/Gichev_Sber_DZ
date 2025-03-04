package DZ4.Validator;

public class PinWrongInputException extends RuntimeException {
    public PinWrongInputException(String msg) {
        super(msg);
    }
}
