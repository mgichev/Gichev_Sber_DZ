package DZ4.DZ4_1.UI;

import DZ4.DZ4_1.Server.WrongSumException;
import DZ4.DZ4_1.Terminal.WrongAuthorizationException;
import DZ4.DZ4_1.Validator.AccountIsLockedException;
import DZ4.DZ4_1.Validator.PinWrongInputException;

public class ExceptionsUI {
    public static void showException(RuntimeException exception) {
        switch (exception) {
            case WrongSumException ex -> System.out.printf("Неправильная сумма: %s\n", ex.getMessage());
            case PinWrongInputException ex -> System.out.printf("Ошибка при авторизации: %s\n", ex.getMessage());
            case AccountIsLockedException ex -> System.out.printf("Ошибка при авторизации: %s: %f\n", ex.getMessage(), ex.getTimeInSec());
            case WrongAuthorizationException ex -> System.out.printf("Ошибка при авторизации: %s\n", ex.getMessage());
            default -> {
                System.out.println(exception.getClass().getSimpleName());
                System.out.println("Неизвестная ошибка");
            }
        }
    }
}
