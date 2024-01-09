package Quiz5prep.Factory;

public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactoryPP = new PayPalPaymentFactory();
        PaymentFactory paymentFactoryCC = new CreditCardPaymentFactory();

        paymentFactoryCC.createPayment().processPayment();
        paymentFactoryPP.createPayment().processPayment();
    }
}
