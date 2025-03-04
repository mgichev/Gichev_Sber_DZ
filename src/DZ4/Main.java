package DZ4;

import DZ4.UI.TerminalUI;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            TerminalUI ui = new TerminalUI(in);
            ui.checkBillState();
            ui.addMoney();
            Thread.sleep(2000);
            ui.checkBillState();
            Thread.sleep(10000);
            ui.getMoney();
            ui.checkBillState();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}