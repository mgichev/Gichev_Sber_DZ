package DZ4.DZ4_1.Server;

public class TerminalServer {

    // для простоты будем использовать общий счет
    private double money = 100;

    public double checkBillState() {
        return money;
    }

    public double addMoney(double sum) {

        checkValidValue(sum);
        checkSumDiv100(sum);

        this.money += sum;
        return money;
    }

    public double getMoney(double sum) {

        checkValidValue(sum);
        checkIsSumMoreMoney(sum);
        checkSumDiv100(sum);

        money -= sum;
        return money;
    }

    private void checkSumDiv100(double sum) {
        if (sum % 100 != 0) {
            throw new WrongSumException(DZ4.DZ4_1.Server.WrongSumException.WrongSumExceptionState.SUM_NOT_DIV_BY_100);
        }

    }

    private void checkIsSumMoreMoney(double sum) {
        if (sum > money) {
            throw new DZ4.DZ4_1.Server.WrongSumException(DZ4.DZ4_1.Server.WrongSumException.WrongSumExceptionState.SUM_MORE_THAN_BILL);
        }
    }

    private void checkValidValue(double sum) {
        if (sum < 0) {
            throw new DZ4.DZ4_1.Server.WrongSumException(DZ4.DZ4_1.Server.WrongSumException.WrongSumExceptionState.SUM_IS_NEGATIVE);
        }

        if (sum > 1000000) {
            throw new DZ4.DZ4_1.Server.WrongSumException(DZ4.DZ4_1.Server.WrongSumException.WrongSumExceptionState.SUM_MORE_THAN_MAX_VALUE);
        }
    }

}
