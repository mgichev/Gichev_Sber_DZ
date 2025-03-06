package DZ4.DZ4_1.Terminal;

public class WrongAuthorizationException extends RuntimeException {
    public WrongAuthorizationException(String text) {
        super(text);
    }
}
