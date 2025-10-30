package ua.ucu.apps.lab8.flower.model;

public class FlowerPack {
    Flower flower;
    int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
        if (flower.getPrice() == 0) {
            flower.setPrice(0);
        }
    }

    public double getPrice(){
        return flower.getPrice() * amount;
    }
}
