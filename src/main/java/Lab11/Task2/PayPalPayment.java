package Lab11.Task2;

public class PayPalPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("New PayPal payment created.");
    }
}
