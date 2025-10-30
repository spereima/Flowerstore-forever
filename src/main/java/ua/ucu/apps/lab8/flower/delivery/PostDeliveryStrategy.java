package ua.ucu.apps.lab8.flower.delivery;

public class PostDeliveryStrategy implements Delivery{

    @Override
    public double delivery(double orderPrice) {
        System.out.println("Postal delivery");
        if (orderPrice > 1000){
            return 0;
        }
        return 100;
    }
    
}
