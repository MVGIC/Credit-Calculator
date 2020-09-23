public class CreditPaymentService {
    public double calculate(double amount, double period) {

        double percent = 9_99 / 12;
        double monthlyPayment = amount * (percent / 1 - (Math.pow(1 + percent, (-12))));

        return monthlyPayment;
    }
}
