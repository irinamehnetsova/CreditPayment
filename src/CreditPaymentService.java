public class CreditPaymentService {
    public double calculate(double credit, double period, double percent){
        double rate = percent / 12;
        double term = period * 12;
        double coefficient = (rate * Math.pow(1 + rate,term))/(Math.pow(1 + rate, term)-1);
        double payment = credit * coefficient;
        return payment;
    }
}
