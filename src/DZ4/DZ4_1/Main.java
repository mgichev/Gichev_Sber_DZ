package DZ4.DZ4_1;

import DZ4.DZ4_1.UI.TerminalUI;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            TerminalUI terminal = new TerminalUI(in);
            terminal.addMoney();
            terminal.addMoney();
        }
    }

}