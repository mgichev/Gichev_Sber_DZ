package DZ4.DZ4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isSuccessfulAttempt = false;
        Scanner in = new Scanner(System.in);
        while (!isSuccessfulAttempt) {
            try {
                Network network = new Network();
                String url = in.next();
                System.out.println(network.readContent(url));
                isSuccessfulAttempt = true;
            } catch (RuntimeException re) {
                System.out.println(re.getMessage());
            }

        }
    }
}
