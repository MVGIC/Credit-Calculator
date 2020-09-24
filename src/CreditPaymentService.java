public class CreditPaymentService {
    public double calculate(double amount, double period) {

        double monthlyPercent = 9.99 / 12 / 100;

        double annuityCoefficient = (monthlyPercent * (Math.pow((1 + monthlyPercent), (period))) / ((Math.pow((1 + monthlyPercent), (period))) - 1));

        double monthlyPayment = amount * annuityCoefficient;

        return monthlyPayment;
    }
}
