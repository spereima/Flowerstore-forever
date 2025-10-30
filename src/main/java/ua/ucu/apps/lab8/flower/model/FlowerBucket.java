package ua.ucu.apps.lab8.flower.model;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{
    private final List<FlowerPack> flowerpacks;
    private final List<Item> flowers = new ArrayList<>();

    public FlowerBucket() {
        flowerpacks = new ArrayList<>();
    }

    public void add(FlowerPack flowerpack) {
        flowerpacks.add(flowerpack);
    }

    @Override
    public double getPrice(){
        double total = 0;
        for(FlowerPack flowerpack : flowerpacks){
            total += flowerpack.getPrice();
        }
        return total;
    }

    public void addFlowers(Item flower) {
        flowers.add(flower);
    }

    public List<Item> searchFlower(String name) {
        return flowers.stream()
                      .filter(f -> f.getDescription().contains(name))
                      .toList();
    }

    @Override
    public String getDescription() {
        return "Flower Bucket containing " + flowers.size() + " flowers";
    }
}
