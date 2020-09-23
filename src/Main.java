public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();


        double monthlyPayment = service.calculate(1_000_000, 12);
        System.out.println(monthlyPayment);
    }
}
