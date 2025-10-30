package ua.ucu.apps.lab8.flower.payment;

public class PayPalPaymentStrategy implements Payment{
    
    @Override
    public void pay(double price) {
        System.out.println("Payment was successfully done by paypal, sum " + price);
    }
}
