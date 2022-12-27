public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double period = 12;
        double percent = 0.0999;

        double payment = service.calculate(credit, period, percent);
        System.out.println("Сумма кредита:" + credit
                + "Ежемесячный платёж:" + payment + "руб" + percent +
                "Срок кредита" + period);

    }
}