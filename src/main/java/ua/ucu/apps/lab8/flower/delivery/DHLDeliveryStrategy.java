package ua.ucu.apps.lab8.flower.delivery;

public class DHLDeliveryStrategy implements Delivery{

    @Override
    public double delivery(double orderPrice) {
        System.out.println("DHL delivery");
        if (orderPrice > 1500){
            return 0;
        }
        return 200;
    }
    
}
