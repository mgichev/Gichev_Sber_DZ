package DZ4.Terminal;

public class WrongAuthorizationException extends RuntimeException {
    public WrongAuthorizationException(String text) {
        super(text);
    }
}
