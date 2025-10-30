package ua.ucu.apps.lab8.flower.model;

public class RomashkaFlower extends Item {
    public RomashkaFlower() {
        this.description = "Romashka Flower";
    }

    @Override
    public double getPrice() {
        return 45;
    }
}
