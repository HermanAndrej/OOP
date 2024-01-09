package Quiz5prep.Factory;

public class CreditCardPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Paid by credit card!");
    }
}
