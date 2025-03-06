package DZ4.DZ4_1.UI;

import DZ4.DZ4_1.Terminal.TerminalImpl;

import java.util.Scanner;

public class TerminalUI {

    private final TerminalImpl terminal;
    private final Scanner scanner;

    public TerminalUI(Scanner scanner) {
        this.scanner = scanner;
        terminal = new TerminalImpl(new Scanner(System.in));
    }

    public void checkBillState() {
        try {
            double balance = terminal.checkBillState();
            System.out.println("На счету " + balance);
        } catch (RuntimeException re) {
            ExceptionsUI.showException(re);
        }
    }

    public void addMoney() {
        try {
            System.out.print("Введите сумму для пополнения: ");
            double money = scanner.nextDouble();
            double balance = terminal.addMoney(money);
            System.out.println("На счету " + balance);
        } catch (RuntimeException re) {
            ExceptionsUI.showException(re);
        }
    }

    public void getMoney() {
        try {
            System.out.print("Введите сумму для снятия: ");
            double money = scanner.nextDouble();
            double balance = terminal.getMoney(money);
            System.out.println("На счету " + balance);
        } catch (RuntimeException re) {
            ExceptionsUI.showException(re);
        }
    }
}
