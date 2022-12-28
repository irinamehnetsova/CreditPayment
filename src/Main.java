public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double period = 1;
        double percent = 0.0999;

        double payment = service.calculate(credit, period, percent);

        System.out.println("Сумма кредита:" + credit);
        System.out.println("Ежемесячный платёж:" + payment + "руб" + percent);
        System.out.println("Срок кредита:" + period);

        System.out.println();
        System.out.println("Ежемесячный платёж:");
        System.out.println(service.calculate(1_000_000,2,0.0999));

        System.out.println();
        System.out.println("Ежемесячный платёж:");
        System.out.println(service.calculate(1_000_000, 3, 0.0999));




    }
}
