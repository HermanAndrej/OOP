package Lab11.Task2;

public class CreditCardPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("Payment by credit card processed.");
    }
}
