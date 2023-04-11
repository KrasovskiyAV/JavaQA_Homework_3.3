public class CreditPaymentService {
    public int calculate(double percent, double months, double sumCredit) {

        double payment = sumCredit * percent / 12 / 100 * Math.pow(1 + percent / 12 / 100, months) / (Math.pow(1 + percent / 12 / 100, months) - 1);

        return (int) payment;
    }
}
