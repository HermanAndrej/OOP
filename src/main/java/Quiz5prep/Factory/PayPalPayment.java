package Quiz5prep.Factory;

public class PayPalPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Paid by PayPal!");
    }
}
