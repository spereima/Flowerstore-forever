package ua.ucu.apps.lab8.flower.decorator;

import ua.ucu.apps.lab8.flower.model.Item;

public abstract class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
