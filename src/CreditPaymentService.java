public class CreditPaymentService {
    public float calculate(float amount, float period) {

        float percent = 9_99;
        float monthlyPayment = (amount / period) + (amount * percent / (100 * 12));


        return monthlyPayment;
    }
}
