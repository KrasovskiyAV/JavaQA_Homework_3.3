public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent; // Годовая процентная ставка, %
        double months; // Срок кредита, мес
        double sumCredit; // Сумма кредита, р
        System.out.println("Ежемесячный платеж: " + service.calculate(9.99, 12, 1_000_000));

        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(9.99, 24, 1_000_000));

        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(9.99, 36, 1_000_000));
    }
}
