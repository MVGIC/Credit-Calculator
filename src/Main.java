public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment12 = service.calculate(1_000_000, 12);
        System.out.printf("%.2f", monthlyPayment12);

        double monthlyPayment24 = service.calculate(1_000_000, 24);
        System.out.printf("%.2f", monthlyPayment24);

        double monthlyPayment36 = service.calculate(1_000_000, 36);
        System.out.printf("%.2f", monthlyPayment36);


    }
}

