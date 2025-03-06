package DZ4.DZ4_1.Validator;

public class PinWrongInputException extends RuntimeException {
    public PinWrongInputException(String msg) {
        super(msg);
    }
}
