package ua.ucu.apps.lab8.flower.model;

public class CactusFlower extends Item {
    public CactusFlower() {
        this.description = "Cactus Flower";
    }

    @Override
    public double getPrice() {
        return 30;
    }
}
