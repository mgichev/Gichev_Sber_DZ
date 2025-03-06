package DZ4.DZ4_1.Validator;

import DZ4.DZ4_1.UI.ExceptionsUI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PinValidator {

    private static final int PIN_LENGTH = 4;
    private static final int MAX_AUTH_AMOUNT_ATTEMPTS = 3;
    private static final int TIMER_WAITING_TIME_MILLIS = 10000;
    private double lastAttemptTime = 0;

    private final List<String> fakePinDB = Arrays.asList("1234", "0000");
    private final Scanner in;

    public PinValidator(Scanner in) {
        this.in = in;
    }

    public boolean check() throws AccountIsLockedException {

        checkIsTimerEnabled();

        int authAmountAttempts = MAX_AUTH_AMOUNT_ATTEMPTS;

        // построчный ввод
        // берем первый символ у каждой строки
        // если было введено больше 1 символа, то выбрасываем ошибку
        // и отлавливаем ее в цикле, чтобы не прерывать текущую попытку авторизации
        while (authAmountAttempts-- > 0) {
            System.out.println("Осталось попыток авторизации " + authAmountAttempts);
            try {
                StringBuilder enteredPin = new StringBuilder();
                String enteredCharOfPin = "";

                for (int i = 0; i < PIN_LENGTH; i++) {
                    System.out.println("Введите следующий символ ");
                    enteredCharOfPin = in.nextLine();
                    if (enteredCharOfPin.length() != 1) {
                        throw new PinWrongInputException("Нужно вводить по 1 символу");
                    } else if (!Character.isDigit(enteredCharOfPin.charAt(0))) {
                        throw new PinWrongInputException("Нужно вводить только цифры");
                    }
                    enteredPin.append(enteredCharOfPin);
                }
                if (fakePinDB.contains(enteredPin.toString()))
                    return true;
            } catch (PinWrongInputException ex) {
                ExceptionsUI.showException(ex);
            }
        }
        lastAttemptTime = System.currentTimeMillis();
        System.out.println("Неправильные попытки авторизации. Аккаунт заблокирован на 10 секунд ");
        return false;
    }


    // вычисляем время таймера на основе текущего времени и завершения прошлой проверки
    private void checkIsTimerEnabled() throws AccountIsLockedException {
        if (System.currentTimeMillis() - lastAttemptTime < TIMER_WAITING_TIME_MILLIS) {
            double time = TIMER_WAITING_TIME_MILLIS - (System.currentTimeMillis() - lastAttemptTime);
            throw new AccountIsLockedException("Доступ к терминалу запрещен в течение времени ", time);
        }
    }
}
