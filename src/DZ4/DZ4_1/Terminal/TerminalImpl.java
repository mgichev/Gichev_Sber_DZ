package DZ4.DZ4_1.Terminal;

import DZ4.DZ4_1.Server.TerminalServer;
import DZ4.DZ4_1.Validator.PinValidator;

import java.util.Scanner;

public class TerminalImpl implements Terminal {

    private final TerminalServer server;
    private final PinValidator validator;

    public TerminalImpl(Scanner in) {
        this.validator = new PinValidator(in);
        this.server= new TerminalServer();
    }

    @Override
    public double checkBillState() {
        tryAuth();
        return server.checkBillState();
    }

    @Override
    public double addMoney(double sum) {
        tryAuth();
        return server.addMoney(sum);
    }

    @Override
    public double getMoney(double sum) {
        tryAuth();
        return server.getMoney(sum);
    }

    private void tryAuth() {
        if (!validator.check()) {
            throw new WrongAuthorizationException("Неправильный пин-код. Попробуйте снова");
        }
    }
}
