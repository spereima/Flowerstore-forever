package ua.ucu.apps.lab8.flower.model;

import lombok.Data;

@Data
public class Item {
    private FlowerBucket flowerBucket;
    protected String description;

    public double getPrice(){
        return flowerBucket.getPrice();
    }

    public String getDescription() {
        return description;
    }

}
